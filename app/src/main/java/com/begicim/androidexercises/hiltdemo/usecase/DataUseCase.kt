package com.begicim.androidexercises.hiltdemo.usecase

import com.begicim.androidexercises.hiltdemo.model.GithubDataModel
import com.begicim.androidexercises.hiltdemo.model.ResultData
import com.begicim.androidexercises.hiltdemo.repositories.DataRepository
import javax.inject.Inject

class DataUseCase @Inject constructor(private val dataRepository: DataRepository) {
    suspend fun getRepositories() : ResultData<GithubDataModel> {
        val publicRepositories = dataRepository.getPublicRepositories()

        return if(!publicRepositories.isNullOrEmpty()){
            ResultData.Success(publicRepositories)
        }else{
            ResultData.Failed("Something went wrong, try again!")
        }
    }
}