package com.example.carding;

import android.graphics.Color;

public class CourseDataModel {
    private String titletxt,pricetxt;
    private int image,bgcolor;

    public CourseDataModel(){}

    public CourseDataModel(String titletxt,String pricetxt,int image,int bgcolor){
        this.titletxt=titletxt;
        this.pricetxt=pricetxt;
        this.image=image;
        this.bgcolor=bgcolor;
    }

    public String getPricetxt() {
        return pricetxt;
    }

    public String getTitletxt() {
        return titletxt;
    }

    public int getBgcolor() {
        return bgcolor;
    }

    public int getImage() {
        return image;
    }
}


