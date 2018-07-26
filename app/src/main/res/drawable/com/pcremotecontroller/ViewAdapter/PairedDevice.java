package com.pcremotecontroller.ViewAdapter;

import android.net.Uri;

/**
 * Created by rifat
 *         on 03-Dec-17
 *         at 2:23 AM
 */

public class PairedDevice {

    private Uri imageUri;
    private String deviceName;
    private String deviceAddress;

    public PairedDevice(Uri imageUri, String deviceName, String deviceAddress)
    {
        this.imageUri = imageUri;
        this.deviceName = deviceName;
        this.deviceAddress = deviceAddress;
    }

    Uri getImageUri() {
        return imageUri;
    }

    String getDeviceName() {
        return deviceName;
    }

    String getDeviceAddress() {
        return deviceAddress;
    }
}
