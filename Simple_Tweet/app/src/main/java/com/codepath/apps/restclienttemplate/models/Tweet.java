package com.codepath.apps.restclienttemplate.models;

import android.icu.text.RelativeDateTimeFormatter;
import android.util.Log;

import com.codepath.apps.restclienttemplate.TimeFormatter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Tweet {
    public static final String TAG = "Tweet";

    public String body;
    public String createdAt;
    public User user;

    //Empty constructor
    public Tweet(){}

    public static Tweet fromJson(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.user= User.fromJson(jsonObject.getJSONObject("user"));
        String formattedTime = TimeFormatter.getTimeDifference(tweet.createdAt);
        tweet.createdAt = formattedTime;
//        Log.i(TAG, tweet.body);
        return tweet;
    }

    public static List<Tweet> fromJsonArray(JSONArray jsonArray) throws JSONException {
        List<Tweet> tweets = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            tweets.add(fromJson(jsonArray.getJSONObject(i)));
        }
        return tweets;
    }


}
