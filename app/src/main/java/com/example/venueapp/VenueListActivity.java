package com.example.venueapp;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.venueapp.requests.ServiceGenerator;
import com.example.venueapp.requests.VenueApi;
import com.example.venueapp.requests.VenueRequestBody;
import com.example.venueapp.requests.responses.VenueResponse;
import com.example.venueapp.requests.responses.VenueSearchResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VenueListActivity extends BaseActivity {

    private static final String TAG = "VenueListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_list);
        findViewById(R.id.test_button).setOnClickListener(view -> testVenuesSearchRequest());
    }

    private void testVenuesSearchRequest() {
        VenueApi venueApi = ServiceGenerator.getVenueApi();

        Call<VenueSearchResponse> responseCall = venueApi.getAllVenues(new VenueRequestBody("44.26097", "20.409843"));

        responseCall.enqueue(new Callback<VenueSearchResponse>() {
            @Override
            public void onResponse(@NonNull Call<VenueSearchResponse> call, @NonNull Response<VenueSearchResponse> response) {
                Log.d(TAG, "onResponse: server response:" + response);
                if (response.code() == 200) {
                    Log.d(TAG, "onResponse: " + (response.body() != null ? response.body().getData() : null));
                    List<VenueResponse> venues = new ArrayList<>(response.body().getData().getVenues());
                    for (VenueResponse venue : venues) {
                        Log.d(TAG, "onResponse: " + venue.getVenue().getName());
                    }
                } else {
                    try {
                        Log.e(TAG, "onResponse: " + (response.errorBody() != null ? response.errorBody().string() : null));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<VenueSearchResponse> call, @NonNull Throwable t) {

            }
        });
    }
}