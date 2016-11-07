package com.example.ajayrwarrier.chronicles;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ajay R Warrier on 06-11-2016.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> newsArrayList) {

        super(context, 0, newsArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView newsTextView = (TextView) listItemView.findViewById(R.id.news_title);
        newsTextView.setText(currentNews.getNewsTitle());
        ImageView newsThumbnail = (ImageView) listItemView.findViewById(R.id.thumbnail);
        newsThumbnail.setImageDrawable(currentNews.getImageDrawable());


        return listItemView;
    }
}

