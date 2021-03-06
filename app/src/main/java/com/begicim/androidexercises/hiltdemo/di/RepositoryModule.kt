package com.begicim.androidexercises.hiltdemo.di

import com.begicim.androidexercises.hiltdemo.network.ApiService
import com.begicim.androidexercises.hiltdemo.repositories.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {
    @Provides
    fun providesDataRepo(apiService: ApiService) : DataRepository{
        return DataRepository(apiService)
    }
}