package com.example.feedapp.presentation

import FeedViewModel
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.feedapp.data.model.FeedItem
import com.example.feedapp.data.model.ImageFeedItem
import com.example.feedapp.data.model.TextFeedItem
import com.example.feedapp.data.model.VideoFeedItem

@Composable
fun FeedScreen(viewModel: FeedViewModel = hiltViewModel()) {
    val feedItems by viewModel.feedItems.collectAsState()

    LazyColumn {
        items(feedItems) { feedItem ->
            when (feedItem) {
                is ImageFeedItem -> ImageFeedItemView(feedItem) {
                    viewModel.onItemClicked(feedItem)
                }
                is TextFeedItem -> TextFeedItemView(feedItem) {
                    viewModel.onItemClicked(feedItem)
                }
                is VideoFeedItem -> VideoFeedItemView(feedItem) {
                    viewModel.onItemClicked(feedItem)
                }
            }
        }
    }
}

@Composable
fun ImageFeedItemView(feedItem: ImageFeedItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        // ... Image display logic (e.g., using Coil)
    }
}

@Composable
fun TextFeedItemView(feedItem: TextFeedItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        // ... Text display logic
    }
}

@Composable
fun VideoFeedItemView(feedItem: VideoFeedItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
    }
}