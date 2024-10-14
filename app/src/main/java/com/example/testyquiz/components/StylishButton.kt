package com.example.testyquiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StylishButton(
    text: String,
    onClick: () -> Unit,
    textColor: Color = Color.White
) {
    val shinyGoldGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFFFFD700),
            Color(0xFFFFC107),
            Color(0xFFFFA000)
        ),
        start = Offset(0f, 0f),
        end = Offset(1000f, 1000f)
    )

    val cornerRadius = RoundedCornerShape(20.dp)

    Box(
        modifier = Modifier
            .padding(8.dp)
            .shadow(8.dp, shape = cornerRadius, clip = false)
            .background(Color.Transparent)
            .clip(cornerRadius)
    ) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            shape = cornerRadius,
            modifier = Modifier
                .background(brush = shinyGoldGradient, shape = cornerRadius)
                .fillMaxWidth()
                .heightIn(min = 48.dp, max = 64.dp)
        ) {
            Text(
                text = text,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = textColor
            )
        }
    }
}