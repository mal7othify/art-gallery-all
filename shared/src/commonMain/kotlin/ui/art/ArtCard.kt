package ui.art

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ArtCard(image: String, title: String, artist: String, desc: String) {
    var expandedState by remember { mutableStateOf(false) }
    Card(
        shape = RoundedCornerShape(10.dp),
        backgroundColor = MaterialTheme.colorScheme.secondaryContainer,
        elevation = 10.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(18.dp)
            .clickable(
                onClick = {
                    expandedState = !expandedState
                }
            )
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painterResource(image),
                contentDescription = null,
                modifier = Modifier
                    .requiredHeight(200.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = title,
                modifier = Modifier.padding(top = 8.dp),
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "by $artist",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(vertical = 8.dp),
                textAlign = TextAlign.Right,
                color = MaterialTheme.colorScheme.primary
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 8.dp),
                imageVector = if (expandedState) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = null,
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground)
            )
            AnimatedVisibility(
                visible = expandedState,
                enter = expandIn() + expandVertically(),
                exit = shrinkOut() + shrinkVertically(),
            ) {
                Text(
                    text = desc,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(12.dp),
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}
