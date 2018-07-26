package com.pcremotecontroller.ClientUtilities;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;

import com.pcremotecontroller.BluetoothUtilities.ConnectionModule;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by rifat
 *         on 11-Dec-17
 *         at 2:01 AM
 */

public class BluetoothClient {

    private BluetoothAdapter bluetoothAdapter;
    private BluetoothDevice bluetoothDevice;
    private BluetoothSocket bluetoothSocket;
    private ConnectionModule connectionModule;
    private boolean flag;

    public BluetoothClient(BluetoothAdapter bluetoothAdapter, BluetoothDevice bluetoothDevice)
    {
        this.bluetoothAdapter = bluetoothAdapter;
        this.bluetoothDevice = bluetoothDevice;
        this.connectionModule = null;
        flag = false;

        BluetoothSocket temp = null;

        try {
            temp = bluetoothDevice.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"));
        } catch (IOException e) {
            Log.e("Bluetooth","Socket's create() method failed", e);
        }

        bluetoothSocket = temp;

        if (bluetoothSocket != null)
        {
            BluetoothConnector bluetoothConnector = new BluetoothConnector(this);
            new Thread(bluetoothConnector).start();
        }
    }

    synchronized public BluetoothSocket getBluetoothSocket()
    {
        while(!flag)
        {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        BluetoothSocket blueSock = this.bluetoothSocket;
        flag = false;
        notifyAll();
        return blueSock;
    }

    synchronized void setBluetoothSocket(BluetoothSocket bluetoothSocket)
    {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        this.bluetoothSocket = bluetoothSocket;
        flag = true;
        notifyAll();
    }

    public void createConnectionModule()
    {
        connectionModule = new ConnectionModule(bluetoothSocket);
    }

    public void cancelConnection()
    {
        try {
            bluetoothSocket.close();
        } catch (IOException closeException) {

            Log.e("Bluetooth", "Could not close the client socket", closeException);
        }
    }

    public void send(Object object)
    {
        connectionModule.send(object);
    }

    BluetoothAdapter getBluetoothAdapter()
    {
        return bluetoothAdapter;
    }

    BluetoothDevice getBluetoothDevice()
    {
        return bluetoothDevice;
    }
}