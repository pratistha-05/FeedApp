import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feedapp.constants.InteractionType
import com.example.feedapp.data.model.FeedItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(private val feedFramework: FeedFramework) : ViewModel() {
  // ... rest of your ViewModel code


  private val _feedItems = MutableStateFlow<List<FeedItem>>(emptyList())
  val feedItems: StateFlow<List<FeedItem>> = _feedItems

  init {
    viewModelScope.launch {
      val feedItems = feedFramework.getFeedItems()
      _feedItems.value = feedItems
    }
  }

  fun onItemClicked(feedItem: FeedItem) {
    feedFramework.handleInteraction(feedItem, InteractionType.CLICK)
  }

  // ... other interaction handling methods
}