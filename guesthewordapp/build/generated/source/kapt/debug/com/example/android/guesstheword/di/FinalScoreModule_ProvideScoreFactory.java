package com.example.android.guesstheword.di;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FinalScoreModule_ProvideScoreFactory implements Factory<Integer> {
  @Override
  public Integer get() {
    return provideScore();
  }

  public static FinalScoreModule_ProvideScoreFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static int provideScore() {
    return FinalScoreModule.INSTANCE.provideScore();
  }

  private static final class InstanceHolder {
    private static final FinalScoreModule_ProvideScoreFactory INSTANCE = new FinalScoreModule_ProvideScoreFactory();
  }
}
