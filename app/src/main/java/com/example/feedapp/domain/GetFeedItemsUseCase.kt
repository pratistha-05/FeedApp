package com.example.feedapp.domain

import com.example.feedapp.data.model.FeedItem
import com.example.feedapp.data.repository.FeedRepository

class GetFeedItemsUseCase(private val repository: FeedRepository) {
  suspend operator fun invoke(): List<FeedItem> {
    return repository.getFeedData()
  }
}