package com.example.flixster_proj1.models;

import android.nfc.Tag;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Movie {

    int movieId;
    String posterPath;
    String title;
    String overview;
    double rating;
//    private Object Tag;

    // empty constructor needed by the Parceler library
    public Movie() {
    }

    public Movie(JSONObject jsonObject) throws JSONException {
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
        rating = jsonObject.getDouble("vote_average");
        movieId = jsonObject.getInt("id");
    }

    public static List<Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < movieJsonArray.length() ; i++) {
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath() {
//        Log.d((String) Tag,String.format("https://image.tmdb.org/t/p/w342",posterPath));
//        return "https://image.tmdb.org/t/p/w342/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg";
        return String.format("https://image.tmdb.org/t/p/w342%s",posterPath);
    }

    public String getTitle(){
        return title;
    }

    public String getOverview(){
        return overview;
    }

    public double getRating() {return rating;}

    public int getMovieId() { return movieId; }
}
