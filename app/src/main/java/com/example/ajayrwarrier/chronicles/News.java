package com.example.ajayrwarrier.chronicles;

import android.graphics.drawable.Drawable;

/**
 * Created by Ajay R Warrier on 06-11-2016.
 */

public class News {


    private String newsTitle;
    private String mUrl;
    private Drawable imageDrawable;


    public News(String newsTitle, String url, Drawable imageUrl) {
        this.newsTitle = newsTitle;
        mUrl = url;
        this.imageDrawable = imageUrl;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public Drawable getImageDrawable() {
        return imageDrawable;
    }
}


