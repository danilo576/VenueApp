package com.example.venueapp.requests;

import androidx.annotation.NonNull;

public class VenueRequestBody {

    private String latitude;
    private String longitude;

    public VenueRequestBody(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public VenueRequestBody() {
    }

    @NonNull
    @Override
    public String toString() {
        return "VenueRequestBody{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
