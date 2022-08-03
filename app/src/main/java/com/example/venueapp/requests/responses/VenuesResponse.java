package com.example.venueapp.requests.responses;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class VenuesResponse {
    @SerializedName("venues")
    @Expose()
    private List<VenueResponse> venues;

    public List<VenueResponse> getVenues() {
        return venues;
    }

    @NonNull
    @Override
    public String toString() {
        return "VenuesResponse{" +
                "venues=" + venues +
                '}';
    }
}
