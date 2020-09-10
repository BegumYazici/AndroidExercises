package com.begicim.androidexercises.hiltdemo.network

import retrofit2.http.GET

interface ApiService {

    @GET
    fun getData(){


    }
}