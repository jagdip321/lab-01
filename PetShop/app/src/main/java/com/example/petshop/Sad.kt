package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun currentMood(): String {
        return "My mood is sad"
    }
}