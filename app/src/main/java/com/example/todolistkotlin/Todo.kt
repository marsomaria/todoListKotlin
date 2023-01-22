package com.example.todolistkotlin

data class Todo (
    val title: String,
    var isChecked: Boolean = false
)
