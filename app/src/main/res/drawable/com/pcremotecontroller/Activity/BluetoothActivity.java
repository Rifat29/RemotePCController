 package com.pcremotecontroller.Activity;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.pcremotecontroller.ClientUtilities.BluetoothClient;
import com.pcremotecontroller.R;
import com.pcremotecontroller.ViewAdapter.PairedDevice;
import com.pcremotecontroller.ViewAdapter.PairedDevicesListAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static android.bluetooth.BluetoothClass.Device.COMPUTER_DESKTOP;
import static android.bluetooth.BluetoothClass.Device.COMPUTER_LAPTOP;
import static android.bluetooth.BluetoothClass.Device.PHONE_CELLULAR;
import static android.bluetooth.BluetoothClass.Device.PHONE_SMART;
import static com.pcremotecontroller.R.layout.activity_bluetooth;

public class BluetoothActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1;
    private static final int MY_PERMISSIONS_REQUEST_ACCESS_COARSE_LOCATION = 1;
    private static final int ENABLE_VIEW = 1;
    private static final int DISABLE_VIEW = 0;

    BluetoothAdapter bluetoothAdapter;
    BluetoothDevice selectedDevice;
    BluetoothSocket bluetoothSocket;
    static BluetoothClient bluetoothClient;
    Switch bluetoothSwitch;
    TextView pairedText;
    TextView availableText;
    ListView pairedDevicesListView;
    ListView availableDevicesListView;
    ViewGroup viewGroup;

    List<PairedDevice> pairedDevicesList;
    List<PairedDevice> availableDevicesList;

    PairedDevicesListAdapter pairedDevicesListAdapter;
    PairedDevicesListAdapter availableDevicesListAdapter;
    //String TAG = "BluetoothActivity";

    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            Uri uri;
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                String deviceName = device.getName();
                int dev = device.getBluetoothClass().getDeviceClass();
                String deviceHardwareAddress = device.getAddress();

                if (dev == PHONE_SMART) {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.smart_phone);
                } else if (dev == COMPUTER_DESKTOP) {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.desktop);
                } else if (dev == COMPUTER_LAPTOP) {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.laptop);
                } else if (dev == PHONE_CELLULAR) {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.cell_phone);
                } else {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.bluetooth);
                }

                PairedDevice availableDevice = new PairedDevice(uri, deviceName, deviceHardwareAddress);
                if (deviceName != null && !availableDevicesList.contains(availableDevice))
                    availableDevicesList.add(availableDevice);
                availableDevicesListAdapter.notifyDataSetChanged();
                refreshView();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(activity_bluetooth);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        bluetoothSwitch = (Switch) findViewById(R.id.bluetooth_switch);
        pairedText = (TextView) findViewById(R.id.paired_text_view);
        availableText = (TextView) findViewById(R.id.available_text_view);
        pairedDevicesListView = (ListView) findViewById(R.id.paired_devices_list_view);
        availableDevicesListView = (ListView) findViewById(R.id.available_devices_list_view);
        viewGroup = (ViewGroup) findViewById(R.id.bluetooth_layout);

        if (bluetoothAdapter.isEnabled())
        {
            bluetoothSwitch.setChecked(true);
            pairedText.setVisibility(View.VISIBLE);
            availableText.setVisibility(View.VISIBLE);
            getPairedDevices();
            searchNewDevices();
        }
        else
        {
            bluetoothSwitch.setChecked(false);
            pairedText.setVisibility(View.INVISIBLE);
            availableText.setVisibility(View.INVISIBLE);
        }

        bluetoothSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    setConnection();
                }
                else
                {
                    stopConnection();
                }
            }
        });

        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(broadcastReceiver, filter);
    }

    public void layoutControl(int mode) {
        switch (mode) {
            case ENABLE_VIEW: {
                pairedText.setVisibility(View.VISIBLE);
                availableText.setVisibility(View.VISIBLE);
                pairedDevicesListView.setVisibility(View.VISIBLE);
                availableDevicesListView.setVisibility(View.VISIBLE);
                break;
            }
            case DISABLE_VIEW: {
                bluetoothSwitch.setChecked(false);
                pairedText.setVisibility(View.INVISIBLE);
                availableText.setVisibility(View.INVISIBLE);
                pairedDevicesListView.setVisibility(View.INVISIBLE);
                availableDevicesListView.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void refreshView()
    {
        viewGroup.setVisibility(View.GONE);
        viewGroup.invalidate();
        viewGroup.postInvalidate();
        viewGroup.setVisibility(View.VISIBLE);
    }

    public void setConnection()
    {
        if (bluetoothAdapter == null)
        {
            Log.w("MainActivity","Device doesn't support bluetooth.");
            return;
        }

        if (!bluetoothAdapter.isEnabled())
        {
            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(intent, REQUEST_ENABLE_BT);
        }
    }

    public void getPairedDevices()
    {
        Set<BluetoothDevice> pairedDevicesSet = bluetoothAdapter.getBondedDevices();
        pairedDevicesList = Collections.synchronizedList(new ArrayList<PairedDevice>());

        pairedDevicesListAdapter = new PairedDevicesListAdapter(this,pairedDevicesList);
        pairedDevicesListView.setAdapter(pairedDevicesListAdapter);

        pairedDevicesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                LinearLayout linearLayout = (LinearLayout) view;

                LinearLayout inner = (LinearLayout) linearLayout.getChildAt(1);

                TextView textView = (TextView) inner.getChildAt(1);
                String address = textView.getText().toString();

                selectedDevice = bluetoothAdapter.getRemoteDevice(address);

                Log.v("paired device:",textView.getText().toString());
                establishConnection();
            }
        });

        if (pairedDevicesSet.size() > 0)
        {
            for (BluetoothDevice device : pairedDevicesSet) {

                String deviceName = device.getName();
                BluetoothClass bluetoothClass = device.getBluetoothClass();
                int dev = bluetoothClass.getDeviceClass();
                String deviceHardwareAddress = device.getAddress();
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.bluetooth);

                if (dev == PHONE_SMART)
                {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.smart_phone);
                }
                else if(dev == COMPUTER_DESKTOP)
                {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.desktop);
                }
                else if(dev == COMPUTER_LAPTOP)
                {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.laptop);
                }
                else if(dev == PHONE_CELLULAR)
                {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.cell_phone);
                }
                pairedDevicesList.add(new PairedDevice(uri, deviceName, deviceHardwareAddress));
                pairedDevicesListAdapter.notifyDataSetChanged();
                refreshView();
            }
        }
    }

    public void searchNewDevices()
    {
        availableDevicesList = Collections.synchronizedList(new ArrayList<PairedDevice>());

        availableDevicesListAdapter = new PairedDevicesListAdapter(this,availableDevicesList);
        availableDevicesListView.setAdapter(availableDevicesListAdapter);

        availableDevicesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                LinearLayout linearLayout = (LinearLayout) view;

                LinearLayout inner = (LinearLayout) linearLayout.getChildAt(1);

                TextView textView = (TextView) inner.getChildAt(1);
                String address = textView.getText().toString();

                selectedDevice = bluetoothAdapter.getRemoteDevice(address);

                Log.v("Available device:",textView.getText().toString());
                establishConnection();
            }
        });

        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
               MY_PERMISSIONS_REQUEST_ACCESS_COARSE_LOCATION);
        bluetoothAdapter.startDiscovery();
    }

    public void establishConnection()
    {
        bluetoothClient = new BluetoothClient(bluetoothAdapter, selectedDevice);
        bluetoothSocket = bluetoothClient.getBluetoothSocket();

        Toast toast;
        if (bluetoothSocket == null) {
            toast = Toast.makeText(this,"Connection Failed.",Toast.LENGTH_LONG);
            toast.show();
        }
        else
        {
            bluetoothClient.createConnectionModule();
            toast = Toast.makeText(this,"Connected.",Toast.LENGTH_LONG);
            toast.show();
            createDeviceSelectionActivity();
        }
    }

    private void createDeviceSelectionActivity()
    {
        Intent intent = new Intent(this, DeviceSelectionActivity.class);
        startActivity(intent);
    }

    public void stopConnection()
    {
        bluetoothAdapter.cancelDiscovery();
        bluetoothAdapter.disable();
        layoutControl(DISABLE_VIEW);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
      bluetoothClient.cancelConnection();
        bluetoothAdapter.cancelDiscovery();
        unregisterReceiver(broadcastReceiver);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == REQUEST_ENABLE_BT)
        {
            if (resultCode == RESULT_OK)
            {
                getPairedDevices();
                bluetoothAdapter.cancelDiscovery();
                searchNewDevices();
                layoutControl(ENABLE_VIEW);
            }
            else
            {
                layoutControl(DISABLE_VIEW);
            }
        }
    }
}