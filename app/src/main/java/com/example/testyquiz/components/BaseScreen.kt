package com.example.testyquiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun BaseScreen(content: @Composable () -> Unit) {
    GradientBackground {
        content()
    }
}

@Composable
fun GradientBackground(modifier: Modifier = Modifier, content: @Composable () -> Unit) {

    val gradientColors = listOf(
        Color(0xFF6A1B9A),
        Color(0xFFAB47BC)
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(gradientColors))
    ) {
        content()
    }

}