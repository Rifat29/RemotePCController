package com.pcremotecontroller.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.pcremotecontroller.R;
import com.pcremotecontroller.ViewAdapter.ListItem;
import com.pcremotecontroller.ViewAdapter.MyListAdapter;

import java.util.ArrayList;

/**
 * Created by rifat
 *         on 28-Dec-17
 *         at 4:56 PM
 */

public class DeviceSelectionActivity extends AppCompatActivity{

    ArrayList<ListItem> devices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_selection);

        devices = new ArrayList<>();
        ListView listView = (ListView) findViewById(R.id.device_selection_list_view);

        devices.add(new ListItem(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.mouse),"Mouse"));
        devices.add(new ListItem(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.keyboard),"Keyboard"));
        devices.add(new ListItem(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.joystick),"Joystick"));
        devices.add(new ListItem(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.speaker),"Speaker"));
        devices.add(new ListItem(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.microphone),"Microphone"));
        devices.add(new ListItem(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.camera),"Camera"));

        MyListAdapter myListAdapter = new MyListAdapter(this,devices);

        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                LinearLayout linearLayout = (LinearLayout) view;
                TextView textView = (TextView) linearLayout.getChildAt(1);

                if (textView.getText().equals("Mouse"))
                {
                    createMouseActivity();
                }
                else if(textView.getText().equals("Keyboard"))
                {
                    createKeyboardActivity();
                }
                else
                {
                    showToast();
                }
            }
        });
    }

    private void createMouseActivity()
    {
        Intent intent = new Intent(this, MouseActivity.class);
        startActivity(intent);
    }

    private void createKeyboardActivity()
    {
        Intent intent = new Intent(this, KeyboardActivity.class);
        startActivity(intent);
    }

    private void showToast()
    {
        Toast toast = Toast.makeText(this,"Sorry, This Feature isn't supported yet", Toast.LENGTH_LONG);
        toast.show();
    }
}