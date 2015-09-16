package com.example.radek.aboutme.network;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.example.radek.aboutme.Constants;

import java.util.Map;

/**
 * Created by Radek on 16/09/15.
 */
public class GoodreeadsRequest {


    public static String  getUserIdUrl() {
        String uri = String.format(Constants.GOODREADS_URL+Constants.GOODREADS_URL_SHOWUSER,
                Constants.GOODREADS_KEY,
                Constants.GOODREADS_USERNAME);

        return uri;
    }
}
