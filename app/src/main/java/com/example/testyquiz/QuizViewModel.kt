package com.example.testyquiz

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

    val questions = listOf(
        Question("What is the capital of France?", listOf("Paris", "London", "Berlin", "Madrid"), 0), // #0
        Question("What is 2 + 2?", listOf("3", "4", "5", "6"), 1), // #1
        Question("What is the largest planet in our solar system?", listOf("Earth", "Mars", "Jupiter", "Saturn"), 2), // #2
        Question("What is the color of the sky?", listOf("Blue", "Green", "Red", "Yellow"), 0), // #3
        Question("What is the freezing point of water?", listOf("0°C", "100°C", "50°C", "32°C"), 0), // #4
    )

    var currentQuestionIndex by mutableIntStateOf(0)
    var score by mutableIntStateOf(0)
    var isQuizStarted by mutableStateOf(false)
    var isQuizFinished by mutableStateOf(false)

    val currentQuestion: Question
        get() = questions[currentQuestionIndex]

    fun startQuiz() {
        isQuizStarted = true
    }

    private fun finishQuiz() {
        isQuizFinished = true
    }

    fun restartQuiz() {
        currentQuestionIndex = 0
        score = 0
        isQuizFinished = false
        isQuizStarted = false
    }

    fun onAnswerSelected(answerIndex: Int) {
        if (answerIndex == currentQuestion.correctAnswerIndex) incrementScore()

        if (currentQuestionIndex < questions.size - 1) nextQuestion()
        else finishQuiz()
    }

    private fun nextQuestion() {
        currentQuestionIndex++
    }

    private fun incrementScore() {
        score++
    }
}