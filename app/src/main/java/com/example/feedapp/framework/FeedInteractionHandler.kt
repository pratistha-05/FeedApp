package com.example.feedapp.framework

import com.example.feedapp.constants.InteractionType
import com.example.feedapp.data.model.FeedItem

interface FeedInteractionHandler {
  fun handleInteraction(feedItem: FeedItem, interactionType: InteractionType)
}