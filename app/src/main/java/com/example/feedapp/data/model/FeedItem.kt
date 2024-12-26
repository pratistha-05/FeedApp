package com.example.feedapp.data.model

import com.example.feedapp.constants.FeedItemType

sealed class FeedItem(
  open val id: String,
  open val postedTimestamp: Long,
  open val sourceInfo: String,
  open val type: FeedItemType
)
