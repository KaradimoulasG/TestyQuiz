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
                viewModel.startQuiz()
            }
        }

        viewModel.isQuizFinished -> {
            FinalScreen(viewModel) {
                viewModel.restartQuiz()
            }
        }

        else -> {
            QuestionScreen(viewModel) {
                viewModel.onAnswerSelected(it)
            }
        }
    }
}