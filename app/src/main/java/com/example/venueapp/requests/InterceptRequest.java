package com.example.venueapp.requests;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class InterceptRequest implements Interceptor {
    @NonNull
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request.Builder requestBuilder = chain.request().newBuilder();

        requestBuilder.addHeader("application", "mobile-application");
        requestBuilder.addHeader("Content-Type", "application/json");
        requestBuilder.addHeader("Device-UUID", "123456");
        requestBuilder.addHeader("Api-Version", "3.7.0");

        return chain.proceed(requestBuilder.build());

    }
}
