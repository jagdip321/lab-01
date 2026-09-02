package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun currentMood(): String {
        return "My mood is happy"
    }
}