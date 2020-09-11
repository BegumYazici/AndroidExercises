package com.begicim.androidexercises.hiltdemo.di

import com.begicim.androidexercises.hiltdemo.repositories.DataRepository
import com.begicim.androidexercises.hiltdemo.usecase.DataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object UseCaseModule{
    @Provides
    fun providesUseCase(dataRepository: DataRepository) : DataUseCase{
        return DataUseCase(dataRepository)
    }
}
