package com.example.rifat.remotepc.ViewAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rifat.remotepc.R;

import java.util.List;

/**
 * Created by rifat
 *         on 04-Dec-17
 *         at 2:25 AM
 */

public class PairedDevicesListAdapter extends ArrayAdapter{

    public PairedDevicesListAdapter(@NonNull Context context, List<PairedDevice> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent)
    {
        PairedDevice pairedDevice = (PairedDevice) getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.paired_devices_list_item, parent, false);
        }

        ImageView deviceImage = convertView.findViewById(R.id.device_image);
        TextView deviceName = convertView.findViewById(R.id.device_name);
        TextView deviceAddress = convertView.findViewById(R.id.device_address);

        if (pairedDevice != null) {
            deviceImage.setImageURI(pairedDevice.getImageUri());
            deviceName.setText(pairedDevice.getDeviceName());
            deviceAddress.setText(pairedDevice.getDeviceAddress());
        }

        return convertView;
    }
}
