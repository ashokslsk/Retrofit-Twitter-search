package com.ashokslsk.twitterapisearch.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Ashu on 25/08/15.
 */
public class TweetList  {

    @SerializedName("statuses")
    public ArrayList<Tweet> tweets;

}
