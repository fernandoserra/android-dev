package com.program.codemobile.devapplication.api;

import android.util.Log;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String TAG = "ApiClient";
    private static Retrofit retrofit;

    public static Retrofit  getClient(String baseUrl){
        Log.i(TAG,"baseUrl: "  + baseUrl);
        OkHttpClient client =  new OkHttpClient();
        //if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        //}
        return  retrofit;
    }
}
