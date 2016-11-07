package com.example.ajayrwarrier.chronicles;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.view.Window;

import java.util.List;
/**
 * Created by Ajay R Warrier on 06-11-2016.
 */
public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private static final String LOG_TAG = NewsLoader.class.getName();
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }


        List<News> newsList = QueryUtils.fetchNewsData(mUrl);
        return newsList;
    }
}
