package com.example.artgallary.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalViewConfiguration
import ui.theme.Typography
import ui.theme.darkGray
import ui.theme.lightGray
import ui.theme.teal200

private val DarkColorScheme = darkColorScheme(
    primary = lightGray,
    secondary = darkGray,
    tertiary = teal200,
    onBackground = lightGray,
    onSecondary = darkGray
)

private val LightColorScheme = lightColorScheme(
    primary = lightGray,
    secondary = darkGray,
    tertiary = teal200,
    onBackground = Color.DarkGray
)

@Composable
fun ArtGalleryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalViewConfiguration.current

    androidx.compose.material3.MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
