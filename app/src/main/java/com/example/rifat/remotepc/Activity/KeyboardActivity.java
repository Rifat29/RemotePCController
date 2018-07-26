package com.example.rifat.remotepc.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.rifat.remotepc.Constants.KeyEvent;
import com.example.rifat.remotepc.CustomLayout.CustomButton;
import com.example.rifat.remotepc.Info.EventMessage;
import com.example.rifat.remotepc.R;

public class KeyboardActivity extends AppCompatActivity {

    boolean isCapsOn = false;
    CustomButton capsLockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);

        //row one starts

        CustomButton customButton = (CustomButton) findViewById(R.id.button_esc);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ESCAPE,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ESCAPE,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f1);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F1,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F1,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f2);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F2,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F2,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f3);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F3,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F3,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f4);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F4,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F4,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f5);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F5,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F5,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f6);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F6,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F6,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f7);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F7,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F7,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f8);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F8,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F8,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f9);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F9,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F9,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f10);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F10,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F10,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f11);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F11,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F11,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f12);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F12,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F12,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_insert);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_INSERT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_INSERT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_delete);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_DELETE,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_DELETE,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });
        //row one ends

        //row two starts
        customButton = (CustomButton) findViewById(R.id.button_tilde);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_BACK_QUOTE,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_BACK_QUOTE,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_1);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_1,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_1,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_2);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_2,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_2,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_3);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_3,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_3,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_4);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_4,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_4,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_5);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_5,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_5,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_6);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_6,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_6,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_7);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_7,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_7,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_8);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_8,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_8,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_9);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_9,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_9,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_0);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_0,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_0,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_minus);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_MINUS,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_MINUS,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_equal);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_EQUALS,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_EQUALS,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_backspace);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_BACK_SPACE,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_BACK_SPACE,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });
        //row two ends

        //row three starts
        customButton = (CustomButton) findViewById(R.id.button_tab);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_TAB,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_TAB,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_q);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_Q,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_Q,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_w);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_W,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_W,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_e);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_E,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_E,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_r);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_R,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_R,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_t);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_T,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_T,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_y);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_Y,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_Y,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_u);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_U,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_U,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_i);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_I,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_I,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_o);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_O,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_O,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_p);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_P,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_P,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_bracket_left);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_OPEN_BRACKET,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_OPEN_BRACKET,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_bracket_right);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CLOSE_BRACKET,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CLOSE_BRACKET,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_backslash);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_BACK_SLASH,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_BACK_SLASH,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });
        //row three ends

        //row four starts
        capsLockButton = (CustomButton) findViewById(R.id.button_caps);

        capsLockButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CAPS_LOCK,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        capsController();
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CAPS_LOCK,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_a);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_A,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_A,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_s);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_S,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_S,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_d);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_D,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_D,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_f);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_F,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_g);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_G,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_G,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_h);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_H,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_H,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_j);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_J,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_J,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_k);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_K,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_K,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_l);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_L,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_L,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_semicolon);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SEMICOLON,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SEMICOLON,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_quote);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_QUOTE,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_QUOTE,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_enter);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ENTER,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ENTER,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        //row four ends

        //row five starts

        customButton = (CustomButton) findViewById(R.id.button_shift_left);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SHIFT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SHIFT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_z);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_Z,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_Z,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_x);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_X,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_X,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_c);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_C,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_C,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_v);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_V,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_V,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_b);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_B,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_B,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_n);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_N,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_N,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_m);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_M,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_M,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_comma);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_COMMA,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_COMMA,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_dot);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_PERIOD,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_PERIOD,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_slash);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SLASH,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SLASH,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_shift_right);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SHIFT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SHIFT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });
        // row five ends

        //row six starts

        customButton = (CustomButton) findViewById(R.id.button_control_left);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CONTROL,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CONTROL,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_function);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_R,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_R,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_super);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_WINDOWS,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_WINDOWS,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_alter_left);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ALT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ALT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_space);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SPACE,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_SPACE,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_alter_right);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ALT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_ALT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_control_right);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CONTROL,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_CONTROL,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_left);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_LEFT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_LEFT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_up);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_UP,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_UP,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_down);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_DOWN,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_DOWN,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });

        customButton = (CustomButton) findViewById(R.id.button_right);

        customButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction())
                {
                    case MotionEvent.ACTION_DOWN:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_RIGHT,1);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(true);
                        return true;
                    }
                    case MotionEvent.ACTION_UP:{
                        EventMessage eventMessage = new EventMessage("KEY_BOARD", KeyEvent.VK_RIGHT,2);
                        BluetoothActivity.bluetoothClient.send(eventMessage);
                        view.setPressed(false);
                        return true;
                    }
                }
                return false;
            }
        });
    }

    private void capsController()
    {
        isCapsOn = !isCapsOn;
        if (isCapsOn)
        {
            capsLockButton.setTextColor(Color.BLUE);
        }
        else
        {
            capsLockButton.setTextColor(Color.BLACK);
        }
    }
}