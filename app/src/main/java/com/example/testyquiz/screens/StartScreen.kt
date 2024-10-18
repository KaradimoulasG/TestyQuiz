package com.example.testyquiz.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testyquiz.components.BaseScreen
import com.example.testyquiz.components.StylishButton
import com.example.testyquiz.components.StylishText

@Composable
fun StartScreen(onStartClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StylishText(text = "Welcome to the Quiz App!")
        Spacer(modifier = Modifier.height(16.dp))
        StylishButton(text = "Start Quiz", onClick = { onStartClick() })
    }
}

@Composable
fun StartBasicScreen(onStartClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to the QuizApp")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { onStartClick() }
        ) {
            Text("Start Quiz")
        }
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewStartScreen() {
    BaseScreen {
        StartScreen {}
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBasicStartScreen() {
    StartBasicScreen {  }
}
