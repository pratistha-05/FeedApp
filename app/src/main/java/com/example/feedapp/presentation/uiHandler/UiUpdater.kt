package com.example.feedapp.presentation.uiHandler

import com.example.feedapp.data.model.FeedItem

interface UiUpdater {
  fun handleClick(feedItem: FeedItem)
  fun handleLongClick(feedItem: FeedItem)
  fun handleLike(feedItem: FeedItem)
  fun handleComment(feedItem: FeedItem)
}
