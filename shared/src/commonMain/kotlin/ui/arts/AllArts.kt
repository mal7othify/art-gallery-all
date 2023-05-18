package ui.arts

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.data.Art
import ui.art.ArtCard

@Composable
fun AllArts(artList: List<Art>) {
    LazyColumn(
        Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(8.dp)
    ) {
        item {
            Header()
        }
        items(artList) { art ->
            ArtCard(art.imageRes, art.title, art.artist, art.description)
        }
    }
}
