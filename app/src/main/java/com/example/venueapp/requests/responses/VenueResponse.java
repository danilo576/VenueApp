package com.example.venueapp.requests.responses;

import androidx.annotation.NonNull;

import com.example.venueapp.models.venue.Venue;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenueResponse {

    @SerializedName("venue")
    @Expose()
    private Venue venue;

    public Venue getVenue() {
        return venue;
    }

    @NonNull
    @Override
    public String toString() {
        return "VenueResponse{" +
                "venue=" + venue +
                '}';
    }
}
