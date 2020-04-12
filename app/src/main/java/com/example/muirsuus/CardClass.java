package com.example.muirsuus;

public class CardClass {
    private int image;
    private String title;
    public CardClass(int image, String title) {
        this.image = image;
        this.title = title;
    }
    public void setImage(int image){
        this.image = image;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getImage() {
        return image;
    }
    public String getTitle() {
        return title;
    }
}