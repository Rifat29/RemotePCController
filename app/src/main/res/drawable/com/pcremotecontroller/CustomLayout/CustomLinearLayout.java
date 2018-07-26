package com.pcremotecontroller.CustomLayout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import static java.lang.Math.abs;

/**
 * Created by rifat
 *         on 01-Jan-18
 *         at 12:32 AM
 */

public class CustomLinearLayout extends LinearLayout {

    private boolean down = false;
    private boolean move = false;
    private long initialTime;
    private float previousX;
    private float previousY;
    private float currentX;
    private float currentY;

    public CustomLinearLayout(Context context) {
        super(context);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e)
    {
        switch (e.getAction())
        {
            case MotionEvent.ACTION_MOVE: {
                if (move)
                {
                    previousX = currentX;
                    previousY = currentY;
                }
                currentX = e.getX();
                currentY = e.getY();
                if ((abs(currentX - previousX) > 5) || (abs(currentY - previousY) > 5))
                {
                    move = true;
                }
                return false;
            }
            case MotionEvent.ACTION_DOWN: {
                    down = true;
                    move = false;
                    previousX = e.getX();
                    previousY = e.getY();
                    initialTime = e.getEventTime();
                    return true;
            }
            case MotionEvent.ACTION_UP:
            {
                if(down && !move)
                {
                    down = false;
                    if(e.getEventTime() - initialTime < 200) {
                        performClick();
                    }
                }
                else if (move)
                {
                    move = false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean performClick()
    {
        super.performClick();
        return true;
    }

    public boolean isMovable()
    {
        return move;
    }

    public float getDx()
    {
        return currentX - previousX;
    }

    public float getDy()
    {
        return currentY - previousY;
    }
}
