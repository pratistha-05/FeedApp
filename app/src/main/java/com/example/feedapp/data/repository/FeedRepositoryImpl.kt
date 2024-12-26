package com.example.feedapp.data.repository

import com.example.feedapp.data.model.FeedItem

class FeedRepositoryImpl(private val dataSource: FeedDataSource) : FeedRepository {
  override suspend fun getFeedData(): List<FeedItem> {
    return dataSource.getFeedData()
  }
}