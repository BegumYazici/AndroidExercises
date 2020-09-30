package com.example.android.guesstheword.main.score;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Integer;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ScoreViewModel_AssistedFactory implements ViewModelAssistedFactory<ScoreViewModel> {
  private final Provider<Integer> finalScore;

  @Inject
  ScoreViewModel_AssistedFactory(Provider<Integer> finalScore) {
    this.finalScore = finalScore;
  }

  @Override
  @NonNull
  public ScoreViewModel create(@NonNull SavedStateHandle arg0) {
    return new ScoreViewModel(finalScore.get());
  }
}
