package com.example.testyquiz.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
fun QuestionScreen(viewModel: QuizViewModel, onAnswerSelected: (Int) -> Unit) {
    val currentQuestion = viewModel.currentQuestion

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StylishText(text = currentQuestion.questionTitle)
        Spacer(modifier = Modifier.height(16.dp))

        currentQuestion.options.forEachIndexed { index, option ->
            StylishButton(
                text = option,
                onClick = { onAnswerSelected(index) }
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuestionScreenPreview() {
    BaseScreen {
        QuestionScreen(QuizViewModel()) { }
    }
}