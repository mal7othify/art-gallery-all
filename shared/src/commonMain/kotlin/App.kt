import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import model.Arts
import ui.arts.AllArts

@Composable
fun App() {
    MaterialTheme {
        Surface(color = MaterialTheme.colorScheme.surface) {
            AllArts(Arts)
        }
    }
}

expect fun getPlatformName(): String
