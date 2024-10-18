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

@Composable
fun FinalBasicScreen(viewModel: QuizViewModel, onRestart: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Quiz completed!")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Your score is ${viewModel.score}/${viewModel.questions.size}!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { onRestart() }
        ) {
            Text(text = "Restart Quiz")
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun FinalScreenPreview() {
    BaseScreen {
        FinalScreen(viewModel = QuizViewModel()) { }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun FinalBasicScreenPreview() {
    FinalBasicScreen(viewModel = QuizViewModel()) { }
}
