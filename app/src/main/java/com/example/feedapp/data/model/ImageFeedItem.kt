package com.example.feedapp.data.model

import com.example.feedapp.constants.FeedItemType

data class ImageFeedItem(
  val imageUrl: String,
  override val id: String,
  override val postedTimestamp: Long,
  override val sourceInfo: String,
  override val type: FeedItemType = FeedItemType.IMAGE
) : FeedItem(id,postedTimestamp, sourceInfo, type)