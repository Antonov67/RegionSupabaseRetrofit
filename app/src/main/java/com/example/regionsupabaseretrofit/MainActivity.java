package com.example.regionsupabaseretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "https://rukiqbmzmtvmfgkyuuun.supabase.co/rest/v1/";
    private static final String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJ1a2lxYm16bXR2bWZna3l1dXVuIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDYxNjk1NTksImV4cCI6MjAyMTc0NTU1OX0.t4TwERx02Zl7Qb2cb1-mRv5HMz7oxGNDLF6BTH8XtU8";
    Retrofit retrofit;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        Call<List<User>> call = api.getUsers(API_KEY, "name,age");
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                textView.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });



    }
}