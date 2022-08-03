package com.example.venueapp.requests;

import com.example.venueapp.requests.responses.VenueSearchResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface VenueApi {

    @POST("directory/search")
    Call<VenueSearchResponse> getAllVenues(@Body VenueRequestBody requestBody);
}
