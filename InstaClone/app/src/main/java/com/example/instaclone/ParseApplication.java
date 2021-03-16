package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FZUgmWr9LbZH7unmZPibuOLYBfh1dWXH9Krl3gnS")
                .clientKey("Bgydb7sAGjyEAblgBXcqFlPEpKcJXOmXhZo6XOMb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
