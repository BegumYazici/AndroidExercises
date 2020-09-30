package com.example.android.guesstheword.main.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/android/guesstheword/main/game/GameFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/android/guesstheword/databinding/GameFragmentBinding;", "viewModel", "Lcom/example/android/guesstheword/main/game/GameViewModel;", "getViewModel", "()Lcom/example/android/guesstheword/main/game/GameViewModel;", "setViewModel", "(Lcom/example/android/guesstheword/main/game/GameViewModel;)V", "gameFinished", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "guesthewordapp_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class GameFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.android.guesstheword.main.game.GameViewModel viewModel;
    private com.example.android.guesstheword.databinding.GameFragmentBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.guesstheword.main.game.GameViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.guesstheword.main.game.GameViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void gameFinished() {
    }
    
    public GameFragment() {
        super();
    }
}