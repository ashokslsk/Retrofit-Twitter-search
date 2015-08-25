package com.ashokslsk.twitterapisearch.event;

import com.ashokslsk.twitterapisearch.api.TweetList;

/**
 * Created by Ashu on 25/08/15.
 */
public class SearchTweetsEventOk {

    public final TweetList tweetsList;

    public SearchTweetsEventOk(TweetList tweets) {
        this.tweetsList = tweets;
    }

}
