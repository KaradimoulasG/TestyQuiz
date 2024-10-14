package com.example.testyquiz.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.testyquiz.QuizViewModel
import com.example.testyquiz.components.BaseScreen
import com.example.testyquiz.components.StylishButton
import com.example.testyquiz.components.StylishText

@Composable
fun FinalScreen(viewModel: QuizViewModel, onRestart: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StylishText(text = "Quiz completed!")
        StylishText(text = "Your score is ${viewModel.score}/${viewModel.questions.size}")
        StylishButton(text = "Restart Quiz", onClick = onRestart)
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_TYPE_WATCH, device = Devices.TABLET)
@Composable
private fun FinalScreenPreview() {
    BaseScreen {
        FinalScreen(viewModel = QuizViewModel()) { }
    }
}