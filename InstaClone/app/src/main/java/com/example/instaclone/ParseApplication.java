package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FZUgmWr9LbZH7unmZPibuOLYBfh1dWXH9Krl3gnS")
                .clientKey("Bgydb7sAGjyEAblgBXcqFlPEpKcJXOmXhZo6XOMb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
