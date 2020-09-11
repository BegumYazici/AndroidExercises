package com.begicim.androidexercises.hiltdemo.repositories

import com.begicim.androidexercises.hiltdemo.model.GithubDataModel
import com.begicim.androidexercises.hiltdemo.network.ApiService
import javax.inject.Inject

class DataRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getPublicRepositories() : GithubDataModel {
        return apiService.getPublicRepositories()
    }
}