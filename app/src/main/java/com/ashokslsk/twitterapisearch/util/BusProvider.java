package com.ashokslsk.twitterapisearch.util;

import com.squareup.otto.Bus;

/**
 * Created by Ashu on 25/08/15.
 */
public class BusProvider {
    private static Bus mInstance = null;

    private BusProvider() {

    }

    public static Bus getInstance() {
        if (mInstance == null) {
            mInstance = new Bus();
        }
        return mInstance;
    }
}
