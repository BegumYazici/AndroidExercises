package com.example.android.guesstheword.di;

import com.example.android.guesstheword.main.score.ScoreViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class FinalScoreModule_ProvideScoreViewModelFactory implements Factory<ScoreViewModel> {
  private final Provider<Integer> scoreProvider;

  public FinalScoreModule_ProvideScoreViewModelFactory(Provider<Integer> scoreProvider) {
    this.scoreProvider = scoreProvider;
  }

  @Override
  public ScoreViewModel get() {
    return provideScoreViewModel(scoreProvider.get());
  }

  public static FinalScoreModule_ProvideScoreViewModelFactory create(
      Provider<Integer> scoreProvider) {
    return new FinalScoreModule_ProvideScoreViewModelFactory(scoreProvider);
  }

  public static ScoreViewModel provideScoreViewModel(int score) {
    return Preconditions.checkNotNull(FinalScoreModule.INSTANCE.provideScoreViewModel(score), "Cannot return null from a non-@Nullable @Provides method");
  }
}
