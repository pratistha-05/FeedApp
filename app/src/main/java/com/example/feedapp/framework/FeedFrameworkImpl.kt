import com.example.feedapp.constants.InteractionType
import com.example.feedapp.data.model.FeedItem
import com.example.feedapp.data.repository.FeedRepository
import com.example.feedapp.domain.GetFeedItemsUseCase
import com.example.feedapp.framework.FeedInteractionHandler
import javax.inject.Inject

class FeedFrameworkImpl @Inject constructor(
  private val getFeedItemsUseCase: GetFeedItemsUseCase,
  private val interactionHandler: FeedInteractionHandler
) : FeedFramework  {
  override suspend fun getFeedItems(): List<FeedItem> {
    return getFeedItemsUseCase()
  }

  override fun handleInteraction(feedItem: FeedItem, interactionType: InteractionType) {
    interactionHandler.handleInteraction(feedItem, interactionType)
  }
}