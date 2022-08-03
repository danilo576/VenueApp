package com.example.venueapp.requests.responses;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenueSearchResponse {

    @SerializedName("data")
    @Expose()
    private VenuesResponse data;

    public VenuesResponse getData() {
        return data;
    }

    @NonNull
    @Override
    public String toString() {
        return "VenueSearchResponse{" +
                "data=" + data +
                '}';
    }
}
