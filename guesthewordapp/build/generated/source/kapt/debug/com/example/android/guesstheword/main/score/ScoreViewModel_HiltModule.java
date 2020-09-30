package com.example.android.guesstheword.main.score;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = ScoreViewModel.class
)
public interface ScoreViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.android.guesstheword.main.score.ScoreViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(ScoreViewModel_AssistedFactory factory);
}
