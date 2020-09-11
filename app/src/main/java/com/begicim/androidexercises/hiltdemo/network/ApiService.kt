package com.begicim.androidexercises.hiltdemo.network

import com.begicim.androidexercises.hiltdemo.model.GithubDataModel
import com.begicim.androidexercises.hiltdemo.utility.NetworkConstants
import retrofit2.http.GET

interface ApiService {
    @GET(NetworkConstants.URL_REPOSITORY)
    suspend fun getPublicRepositories() : GithubDataModel
}