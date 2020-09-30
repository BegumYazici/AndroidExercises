package com.example.android.guesstheword.main.score;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ScoreViewModel_AssistedFactory_Factory implements Factory<ScoreViewModel_AssistedFactory> {
  private final Provider<Integer> finalScoreProvider;

  public ScoreViewModel_AssistedFactory_Factory(Provider<Integer> finalScoreProvider) {
    this.finalScoreProvider = finalScoreProvider;
  }

  @Override
  public ScoreViewModel_AssistedFactory get() {
    return newInstance(finalScoreProvider);
  }

  public static ScoreViewModel_AssistedFactory_Factory create(
      Provider<Integer> finalScoreProvider) {
    return new ScoreViewModel_AssistedFactory_Factory(finalScoreProvider);
  }

  public static ScoreViewModel_AssistedFactory newInstance(Provider<Integer> finalScore) {
    return new ScoreViewModel_AssistedFactory(finalScore);
  }
}
