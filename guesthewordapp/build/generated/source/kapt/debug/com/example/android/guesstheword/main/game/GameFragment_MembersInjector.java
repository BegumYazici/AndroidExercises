package com.example.android.guesstheword.main.game;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class GameFragment_MembersInjector implements MembersInjector<GameFragment> {
  private final Provider<GameViewModel> viewModelProvider;

  public GameFragment_MembersInjector(Provider<GameViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<GameFragment> create(Provider<GameViewModel> viewModelProvider) {
    return new GameFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(GameFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.example.android.guesstheword.main.game.GameFragment.viewModel")
  public static void injectViewModel(GameFragment instance, GameViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
