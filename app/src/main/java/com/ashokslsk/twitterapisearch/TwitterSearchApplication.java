package com.ashokslsk.twitterapisearch;

import android.app.Application;
import android.content.Context;

import com.ashokslsk.twitterapisearch.api.ApiConstants;
import com.ashokslsk.twitterapisearch.api.TwitterApiService;
import com.ashokslsk.twitterapisearch.api.TwitterServiceProvider;
import com.ashokslsk.twitterapisearch.util.BusProvider;
import com.squareup.otto.Bus;

import retrofit.RestAdapter;

/**
 * Created by Ashu on 25/08/15.
 */
public class TwitterSearchApplication extends Application {
    private static TwitterSearchApplication mInstance;
    private static Context mAppContext;

    private TwitterServiceProvider mTwitterService;
    private Bus bus = BusProvider.getInstance();

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        this.setAppContext(getApplicationContext());
        mTwitterService = new TwitterServiceProvider(buildApi(), bus);
        bus.register(mTwitterService);
        bus.register(this); //listen to "global" events
    }

    private TwitterApiService buildApi() {
        return new RestAdapter.Builder()
                .setEndpoint(ApiConstants.TWITTER_SEARCH_URL)
                .build()
                .create(TwitterApiService.class);
    }

/*	@Subscribe
	public void onApiError(ApiErrorEvent event) {
		toast("Something went wrong, please try again.");
		Log.e("ReaderApp", event.getErrorMessage());
	}*/

    public static TwitterSearchApplication getInstance(){
        return mInstance;
    }
    public static Context getAppContext() {
        return mAppContext;
    }
    public void setAppContext(Context mAppContext) {
        this.mAppContext = mAppContext;
    }


}
