package com.ashokslsk.twitterapisearch.util;

import android.content.Context;
import android.util.Base64;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

/**
 * Created by Ashu on 25/08/15.
 */
public final class Util {

    public static final int INTERNET_CONN_CHECK_TIMEOUT = 1500;

    private static final String TAG = Util.class.getName();

    private Util() {

    }

    public static void makeToast(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    public static String getBase64String(String value) throws UnsupportedEncodingException {
        return Base64.encodeToString(value.getBytes("UTF-8"), Base64.NO_WRAP);
    }

}