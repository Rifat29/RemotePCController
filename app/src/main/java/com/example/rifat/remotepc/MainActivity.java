package com.example.rifat.remotepc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import com.example.rifat.remotepc.Activity.BluetoothActivity;
import com.example.rifat.remotepc.ViewAdapter.ListItem;
import com.example.rifat.remotepc.ViewAdapter.MyListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);

        ArrayList<ListItem> arrayList = new ArrayList<>(3);
        arrayList.add(new ListItem(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.drawable.bluetooth), "Bluetooth"));
        arrayList.add(new ListItem(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.drawable.wifi), "Wifi"));
        arrayList.add(new ListItem(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.drawable.internet), "Internet"));
        arrayList.add(new ListItem(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.drawable.usb), "USB"));

        MyListAdapter myListAdapter = new MyListAdapter(this,arrayList);

        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                LinearLayout linearLayout = (LinearLayout) view;
                TextView textView = (TextView) linearLayout.getChildAt(1);

                if (textView.getText().equals("Bluetooth"))
                {
                    createBluetoothActivity();
                }
                else if (textView.getText().equals("Wifi"))
                {

                }
            }
        });
    }

    public void createBluetoothActivity()
    {
        Intent intent = new Intent(this, BluetoothActivity.class);
        startActivity(intent);
    }

}
