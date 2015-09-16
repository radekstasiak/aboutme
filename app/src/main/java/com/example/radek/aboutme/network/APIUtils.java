package com.example.radek.aboutme.network;

import android.app.Activity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.radek.aboutme.DisplayBooks;

/**
 * Created by Radek on 16/09/15.
 */
public class APIUtils {

    private String globalResponse;
    private DisplayBooks mActivity;
    public APIUtils(DisplayBooks act){

        mActivity = act;

    }
    public String getGlobalResponse(){
        return globalResponse;
    }
    public void getGoodReadsUserId(){

        StringRequest request = new StringRequest(Request.Method.GET, GoodreeadsRequest.getUserIdUrl(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //TODO add user id to string
                        mActivity.getTextView().setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mActivity.getTextView().setText(error.getMessage());
            }
        });


        VolleyApplication.getInstance().getRequestQueue().add(request);
    }
}
