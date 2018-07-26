package com.pcremotecontroller.ViewAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pcremotecontroller.R;

import java.util.ArrayList;

/**
 * Created by rifat
 *         on 02-Dec-17
 *         at 2:20 AM
 */

public class MyListAdapter extends ArrayAdapter {

    public MyListAdapter(@NonNull Context context, ArrayList<ListItem> resource)
    {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent)
    {
        ListItem listItem = (ListItem) getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView textView = convertView.findViewById(R.id.text_view);

        if (listItem != null) {
            imageView.setImageURI(listItem.getImageUri());
            textView.setText(listItem.getText());
        }
        return convertView;
    }
}
