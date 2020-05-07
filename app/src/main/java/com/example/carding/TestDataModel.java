package com.example.carding;

public class TestDataModel {
    private String titletxt;
    private int color;

    public TestDataModel(){}

    public TestDataModel(String titletxt,int color){
        this.titletxt=titletxt;
        this.color=color;
    }

    public String getTitletxt() {
        return titletxt;
    }

    public int getColor() {
        return color;
    }
}
