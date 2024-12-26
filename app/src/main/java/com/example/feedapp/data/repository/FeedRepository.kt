package com.example.feedapp.data.repository

import com.example.feedapp.data.model.FeedItem

interface FeedRepository {
  suspend fun getFeedData(): List<FeedItem>
}