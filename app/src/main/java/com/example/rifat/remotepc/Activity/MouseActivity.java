package com.example.rifat.remotepc.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.example.rifat.remotepc.CustomLayout.CustomButton;
import com.example.rifat.remotepc.CustomLayout.CustomLinearLayout;
import com.example.rifat.remotepc.Info.EventMessage;
import com.example.rifat.remotepc.R;

import static com.example.rifat.remotepc.Constants.MouseEvent.BUTTON1;
import static com.example.rifat.remotepc.Constants.MouseEvent.BUTTON3;
import static com.example.rifat.remotepc.Constants.MouseEvent.NOBUTTON;

public class MouseActivity extends AppCompatActivity {

    private CustomLinearLayout customLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouse);

        customLinearLayout = (CustomLinearLayout) findViewById(R.id.touchpad_layout);

        CustomButton leftButton = (CustomButton) findViewById(R.id.left_button);
        CustomButton rightButton = (CustomButton) findViewById(R.id.right_button);

        customLinearLayout.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_MOVE: {
                        sendMove();
                    }
                }
                return false;
            }

        });

        customLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventMessage eventMessage = new EventMessage("MOUSE",1,1);
                BluetoothActivity.bluetoothClient.send(eventMessage);
                eventMessage = new EventMessage("MOUSE",1,2);
                BluetoothActivity.bluetoothClient.send(eventMessage);
            }
        });

        leftButton.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("MOUSE",BUTTON1,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("MOUSE",BUTTON1,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        rightButton.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("MOUSE",BUTTON3,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("MOUSE",BUTTON3,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });
    }

    private void sendMove()
    {
        if (customLinearLayout.isMovable())
        {
            EventMessage eventMessage = new EventMessage("MOUSE",NOBUTTON,3);
            eventMessage.setCoordinate(customLinearLayout.getDx(), customLinearLayout.getDy());
            BluetoothActivity.bluetoothClient.send(eventMessage);
        }
    }
}