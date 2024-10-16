package com.example.testyquiz

data class Question(
    val questionTitle: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)