package com.example.rifat.remotepc.ViewAdapter;

import android.net.Uri;

/**
 * Created by rifat
 *         on 02-Dec-17
 *         at 2:19 AM
 */

public class ListItem {

    private Uri imageUri;
    private String text;

    public ListItem(Uri imageUri, String text)
    {
        this.imageUri = imageUri;
        this.text = text;
    }

    Uri getImageUri()
    {
        return imageUri;
    }

    String getText()
    {
        return text;
    }
}
