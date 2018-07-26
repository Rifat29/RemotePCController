package com.pcremotecontroller.ClientUtilities;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by rifat
 *         on 06-Dec-17
 *         at 1:31 AM
 */

public class BluetoothConnector implements Runnable {

    private BluetoothAdapter bluetoothAdapter;
    private BluetoothClient bluetoothClient;
    private BluetoothSocket bluetoothSocket;

    BluetoothConnector(BluetoothClient bluetoothClient)
    {
        this.bluetoothClient = bluetoothClient;
        this.bluetoothAdapter = bluetoothClient.getBluetoothAdapter();
        BluetoothDevice bluetoothDevice = bluetoothClient.getBluetoothDevice();

        BluetoothSocket temp = null;

        try {
            temp = bluetoothDevice.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"));
        } catch (IOException e) {
            Log.e("Bluetooth","Socket's create() method failed", e);
        }

        bluetoothSocket = temp;
    }

    @Override
    public void run() {
        bluetoothAdapter.cancelDiscovery();

        try {
            bluetoothSocket.connect();
            bluetoothClient.setBluetoothSocket(bluetoothSocket);
        } catch (IOException connectException) {
            bluetoothClient.setBluetoothSocket(null);
            Log.e("BluetoothConnector","Could not connect with the socket", connectException);
            try {
                bluetoothSocket.close();
            } catch (IOException closeException) {
                Log.e("BluetoothConnector", "Could not close the client socket", closeException);
            }
        }
    }
}