package com.example.rifat.remotepc.Info;

import java.io.Serializable;

/**
 * Created by rifat
 *         on 01-Dec-17
 *         at 12:42 AM
 */

public class EventMessage implements Serializable {

    private String device;
    private int keycode;
    private int keyStatus;
    private float dx;
    private float dy;

    public EventMessage(String device, int keycode, int keyStatus)
    {
        this.device = device;
        this.keycode = keycode;
        this.keyStatus = keyStatus;
    }

    public void setCoordinate(float dx, float dy)
    {
        this.dx = dx;
        this.dy = dy;
    }

    public String getDevice()
    {
        return device;
    }

    public int getKeycode()
    {
        return keycode;
    }

    public int getKeyStatus()
    {
        return keyStatus;
    }

    public float getDx() {
        return dx;
    }

    public float getDy() {
        return dy;
    }
}
