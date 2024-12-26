package com.example.feedapp.framework

import com.example.feedapp.constants.InteractionType
import com.example.feedapp.data.model.FeedItem
import com.example.feedapp.presentation.uiHandler.UiUpdater
import javax.inject.Inject

class InteractionHandlerImpl @Inject constructor(
  private val uiUpdater: UiUpdater
) : FeedInteractionHandler {
  override fun handleInteraction(feedItem: FeedItem, interactionType: InteractionType) {
    when (interactionType) {
      InteractionType.CLICK -> uiUpdater.handleClick(feedItem)
      InteractionType.LONG_CLICK -> uiUpdater.handleLongClick(feedItem)
      InteractionType.LIKE -> uiUpdater.handleLike(feedItem)
      InteractionType.COMMENT -> uiUpdater.handleComment(feedItem)
    }
  }
}
