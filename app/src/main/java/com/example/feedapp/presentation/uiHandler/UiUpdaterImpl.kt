package com.example.feedapp.presentation.uiHandler

import com.example.feedapp.data.model.FeedItem
import com.example.feedapp.data.model.ImageFeedItem
import com.example.feedapp.data.model.TextFeedItem
import com.example.feedapp.data.model.VideoFeedItem

class UiUpdaterImpl : UiUpdater {

  override fun handleClick(feedItem: FeedItem) {

    when (feedItem) {
      is TextFeedItem -> {
        println("Navigating to TextFeedItem details")
      }
      is ImageFeedItem -> {
        println("Expanding ImageFeedItem")
      }
      is VideoFeedItem -> {
        println("Playing VideoFeedItem")
      }
    }
  }

  override fun handleLongClick(feedItem: FeedItem) {
    if (feedItem is TextFeedItem) {
      println("Copying TextFeedItem text to clipboard")
    }
  }

  override fun handleLike(feedItem: FeedItem) {
    println("Updating UI to reflect like for ${feedItem.id}")
  }

  override fun handleComment(feedItem: FeedItem) {
    println("Displaying comment for ${feedItem.id}:")
  }

}