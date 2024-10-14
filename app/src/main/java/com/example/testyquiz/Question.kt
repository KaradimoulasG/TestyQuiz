package com.example.testyquiz

data class Question(
    val question: String,
    val options: List<String>,
    val correctOptionsIndex: Int
)