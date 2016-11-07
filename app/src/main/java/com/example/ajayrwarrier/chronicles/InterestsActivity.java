package com.example.ajayrwarrier.chronicles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class InterestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        ArrayList<ImageItem> imageItems = new ArrayList<>();
        imageItems.add(new ImageItem(R.drawable.motivation, "Lifestyle", "lifeandstyle"));
        imageItems.add(new ImageItem(R.drawable.technology, "Technology", "technology"));
        imageItems.add(new ImageItem(R.drawable.entertainment, "Entertainment", "culture"));
        imageItems.add(new ImageItem(R.drawable.business, "Business", "business"));
        imageItems.add(new ImageItem(R.drawable.science, "Science", "science"));
        imageItems.add(new ImageItem(R.drawable.sports, "Sports", "sport"));
        imageItems.add(new ImageItem(R.drawable.currentaffairs, "Current Affairs", "world"));
        imageItems.add(new ImageItem(R.drawable.games, "Games", "technology/games"));
        GridViewAdapter gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, imageItems);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                //Create intent
                Intent intent = new Intent(InterestsActivity.this, NewsActivity.class);
                intent.putExtra("category", item.getCategory());
                intent.putExtra("title", item.getTitle());


                //Start details activity
                startActivity(intent);
            }
        });

    }

}
