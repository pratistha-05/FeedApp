package com.example.feedapp.data.model

import com.example.feedapp.constants.FeedItemType

data class VideoFeedItem(
  val videoUrl: String,
  override val id: String,
  override val postedTimestamp: Long,
  override val sourceInfo: String,
  override val type: FeedItemType = FeedItemType.VIDEO
) : FeedItem(id,postedTimestamp, sourceInfo, type)