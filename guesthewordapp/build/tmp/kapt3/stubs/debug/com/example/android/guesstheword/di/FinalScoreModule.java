package com.example.android.guesstheword.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/android/guesstheword/di/FinalScoreModule;", "", "()V", "provideScore", "", "provideScoreViewModel", "Lcom/example/android/guesstheword/main/score/ScoreViewModel;", "score", "guesthewordapp_debug"})
@dagger.Module()
public final class FinalScoreModule {
    public static final com.example.android.guesstheword.di.FinalScoreModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.android.guesstheword.main.score.ScoreViewModel provideScoreViewModel(int score) {
        return null;
    }
    
    @dagger.Provides()
    public final int provideScore() {
        return 0;
    }
    
    private FinalScoreModule() {
        super();
    }
}