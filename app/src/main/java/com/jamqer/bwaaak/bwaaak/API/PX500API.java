package com.jamqer.bwaaak.bwaaak.API;


import com.jamqer.bwaaak.bwaaak.Model.getPhotoResponse;

import java.util.Map;
import java.util.Observable;

import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by Piotras on 2015-11-28.
 */
public interface PX500API {

    @GET("/photos/search?")
    rx.Observable<getPhotoResponse> getPhotosByName(@QueryMap Map<String,String> StringMap);
}
