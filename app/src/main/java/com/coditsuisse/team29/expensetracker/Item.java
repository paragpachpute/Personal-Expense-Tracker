package com.coditsuisse.team29.expensetracker;

import android.graphics.Bitmap;

/**
 * Created by Pranay on 9/12/2015.
 */
public class Item {
    Bitmap image;
    String title;
    public Item(Bitmap image, String title) {
        this.image = image;
        this.title = title;
    }
    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
