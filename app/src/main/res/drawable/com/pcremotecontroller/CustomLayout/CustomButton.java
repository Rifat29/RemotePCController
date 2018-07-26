package com.pcremotecontroller.CustomLayout;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by rifat
 * on 02-Jan-18
 * at 5:29 PM
 */

public class CustomButton extends android.support.v7.widget.AppCompatButton {
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performClick()
    {
        super.performClick();
        return true;
    }
}
