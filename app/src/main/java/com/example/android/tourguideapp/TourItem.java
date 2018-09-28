package com.example.android.tourguideapp;

public class TourItem {

    private String title;
    private String eventDesc;
    private String location;
    private int image;

    public TourItem(String title, String eventDesc, String location, int image) {
        this.title = title;
        this.eventDesc = eventDesc;
        this.location = location;
        this.image = image;
    }

    public TourItem(String title, String location, String eventDesc) {
        this.title = title;
        this.location = location;
        this.eventDesc = eventDesc;
    }

    public String getTitle() {
        return title;
    }
    public String getEventDesc() {
        return eventDesc;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }
}
