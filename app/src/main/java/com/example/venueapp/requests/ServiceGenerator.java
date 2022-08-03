package com.example.venueapp.requests;

import com.example.venueapp.util.Constants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(new InterceptRequest())
            .build();

    private static final Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create());

    private static final Retrofit retrofit = retrofitBuilder.build();

    private static final VenueApi venueApi = retrofit.create(VenueApi.class);

    public static VenueApi getVenueApi() {
        return venueApi;
    }
}
