package com.example.feedapp.data.repository.impl

import com.example.feedapp.data.model.FeedItem
import com.example.feedapp.data.repository.FeedDataSource
import com.example.feedapp.data.repository.FeedRepository

class FeedRepositoryImpl(private val dataSource: FeedDataSource) : FeedRepository {
  override suspend fun getFeedData(): List<FeedItem> {
    return dataSource.getFeedData()
  }
}