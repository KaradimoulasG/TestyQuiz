package com.example.testyquiz

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.testyquiz.screens.FinalScreen
import com.example.testyquiz.screens.QuestionScreen
import com.example.testyquiz.screens.StartScreen

@Composable
fun TriviaApp() {
    val viewModel: QuizViewModel = viewModel()

    when {
        !viewModel.isQuizStarted -> {
            StartScreen {
                viewModel.isQuizStarted = true
            }
        }

        viewModel.isQuizFinished -> {
            FinalScreen(viewModel) {
                viewModel.resetQuiz()
                viewModel.isQuizFinished = false
                viewModel.isQuizStarted = false
            }
        }

        else -> {
            QuestionScreen(viewModel) {
                viewModel.finishQuiz()
            }
        }
    }
}