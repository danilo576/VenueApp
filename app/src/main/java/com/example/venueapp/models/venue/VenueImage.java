package com.example.venueapp.models.venue;

public class VenueImage {
    private String thumbnail_small;
    private String thumbnail_medium;
    private String fullsize;

    public VenueImage(String thumbnail_small, String thumbnail_medium, String fullsize) {
        this.thumbnail_small = thumbnail_small;
        this.thumbnail_medium = thumbnail_medium;
        this.fullsize = fullsize;
    }

    public String getThumbnail_small() {
        return thumbnail_small;
    }

    public void setThumbnail_small(String thumbnail_small) {
        this.thumbnail_small = thumbnail_small;
    }

    public String getThumbnail_medium() {
        return thumbnail_medium;
    }

    public void setThumbnail_medium(String thumbnail_medium) {
        this.thumbnail_medium = thumbnail_medium;
    }

    public String getFullsize() {
        return fullsize;
    }

    public void setFullsize(String fullsize) {
        this.fullsize = fullsize;
    }

    @Override
    public String toString() {
        return "VenueImage{" +
                "thumbnail_small='" + thumbnail_small + '\'' +
                ", thumbnail_medium='" + thumbnail_medium + '\'' +
                ", fullsize='" + fullsize + '\'' +
                '}';
    }
}
