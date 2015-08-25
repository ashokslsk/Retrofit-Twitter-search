package com.ashokslsk.twitterapisearch.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ashu on 25/08/15.
 */
public class TwitterTokenType {

    @SerializedName("token_type")
    public String tokenType;

    @SerializedName("access_token")
    public String accessToken;

}