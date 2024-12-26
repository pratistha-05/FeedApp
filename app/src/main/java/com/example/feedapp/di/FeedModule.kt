package com.example.feedapp.di

import FeedViewModel
import androidx.lifecycle.ViewModel
import com.example.feedapp.data.repository.FeedRepository
import com.example.feedapp.data.repository.impl.FeedRepositoryImpl
import com.example.feedapp.presentation.uiHandler.UiUpdater
import com.example.feedapp.presentation.uiHandler.UiUpdaterImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

  @Binds
  @Singleton
  abstract fun bindFeedRepository(
    impl: FeedRepositoryImpl
  ): FeedRepository

  @Binds
  @Singleton
  abstract fun bindUiUpdater(
    impl: UiUpdaterImpl
  ): UiUpdater
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

  @Binds
  @IntoMap
  @ViewModelKey(FeedViewModel::class)
  abstract fun bindFeedViewModel(
    viewModel: FeedViewModel
  ): ViewModel
}
