package com.example.captionprediction;

import com.google.gson.annotations.SerializedName;

public class ImageClass {

    @SerializedName("caption")
    private String caption;

    public ImageClass(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }
}
