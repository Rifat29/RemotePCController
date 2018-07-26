package com.pcremotecontroller.BluetoothUtilities;

import android.bluetooth.BluetoothSocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rifat
 *         on 01-Dec-17
 *         at 4:57 PM
 */

public class ConnectionModule {

    private BluetoothSocket bluetoothSocket;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;
    private boolean alive;

    public ConnectionModule(BluetoothSocket bluetoothSocket)
    {
        this.bluetoothSocket = bluetoothSocket;
        try {
            objectInputStream = new ObjectInputStream(bluetoothSocket.getInputStream());
            objectOutputStream = new ObjectOutputStream(bluetoothSocket.getOutputStream());
            alive = true;
        } catch (IOException e) {
            e.printStackTrace();
            alive = false;
        }
    }

    public void send(Object object)
    {
        try {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
            alive = false;
        }
    }

    public Object receive()
    {
        try {
            return objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            alive = false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public BluetoothSocket getBluetoothSocket() {
        return bluetoothSocket;
    }
}