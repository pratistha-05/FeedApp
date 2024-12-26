import com.example.feedapp.constants.InteractionType
import com.example.feedapp.data.model.FeedItem

interface FeedFramework {
  suspend fun getFeedItems(): List<FeedItem>
  fun handleInteraction(feedItem: FeedItem, interactionType: InteractionType)
}