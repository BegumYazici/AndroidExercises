package com.begicim.androidexercises.hiltdemo.ui.main.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.begicim.androidexercises.hiltdemo.model.GithubDataModel
import com.begicim.androidexercises.hiltdemo.model.ResultData
import com.begicim.androidexercises.hiltdemo.usecase.DataUseCase
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(private val useCase: DataUseCase) : ViewModel() {
    fun getRepositoriesList() : LiveData<ResultData<GithubDataModel>> {
        return liveData<ResultData<GithubDataModel>> {
            emit(ResultData.Loading())
            emit(useCase.getRepositories())
        }
    }
}