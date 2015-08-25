package com.ashokslsk.twitterapisearch.event;

/**
 * Created by Ashu on 25/08/15.
 */
public class SearchTweetsEvent {

    public final String hashtag;
    public final String twitterToken;

    public SearchTweetsEvent(String twitterToken, String hashtag) {
        this.hashtag = hashtag;
        this.twitterToken = twitterToken;
    }


}
