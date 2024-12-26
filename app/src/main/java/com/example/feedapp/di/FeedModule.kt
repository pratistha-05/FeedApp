package com.example.feedapp.di

import FeedFramework
import FeedFrameworkImpl
import com.example.feedapp.data.repository.FeedRepository
import com.example.feedapp.data.repository.FeedRepositoryImpl
import com.example.feedapp.framework.FeedInteractionHandler
import com.example.feedapp.framework.InteractionHandlerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FeedModule {

  @Binds
  abstract fun bindFeedFramework(impl: FeedFrameworkImpl): FeedFramework

  @Binds
  abstract fun bindFeedRepository(impl: FeedRepositoryImpl): FeedRepository

  @Binds
  abstract fun bindFeedInteractionHandler(impl: InteractionHandlerImpl): FeedInteractionHandler
}