package com.example.android.guesstheword.di

import com.example.android.guesstheword.main.score.ScoreViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object FinalScoreModule {

    @Provides
    fun provideScoreViewModel(score: Int) : ScoreViewModel{
        return ScoreViewModel(score)
    }

    @Provides
    fun provideScore() : Int{
        return 5
    }
}