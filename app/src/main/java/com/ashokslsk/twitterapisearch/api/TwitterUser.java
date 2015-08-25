package com.ashokslsk.twitterapisearch.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ashu on 25/08/15.
 */
public class TwitterUser {

    @SerializedName("screen_name")
    public String screenName;

    @SerializedName("name")
    public String name;

    @SerializedName("profile_image_url")
    public String profileImageUrl;

}