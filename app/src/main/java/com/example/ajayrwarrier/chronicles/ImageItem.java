package com.example.ajayrwarrier.chronicles;

/**
 * Created by Ajay R Warrier on 05-11-2016.
 */
public class ImageItem {
    private int imageId;
    private String title;
    private String category;


    public ImageItem(int image, String title, String category) {
        super();
        this.imageId = image;
        this.title = title;
        this.category = category;

    }

    public int getImage() {
        return imageId;
    }


    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }


}
