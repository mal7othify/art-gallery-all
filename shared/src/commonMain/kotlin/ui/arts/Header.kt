package ui.arts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            imageVector = Icons.Outlined.Star,
            contentDescription = null,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
            modifier = Modifier
                .padding(start = 15.dp)
                .align(Alignment.TopCenter)
                .size(24.dp)
        )
        Text(
            "Art Gallery",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .padding(start = 15.dp, top = 20.dp, bottom = 8.dp)
                .align(Alignment.CenterStart)
        )
    }
    Text(
        "“Painting is poetry that is seen rather than felt, and poetry is painting that is felt rather than seen.”",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(8.dp)
    )
    Text(
        "― Leonardo da Vinci",
        style = MaterialTheme.typography.titleSmall,
        color = MaterialTheme.colorScheme.onBackground,
        modifier = Modifier.padding(start = 40.dp, bottom = 15.dp)
    )
}
