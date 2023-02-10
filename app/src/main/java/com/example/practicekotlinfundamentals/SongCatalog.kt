package com.example.practicekotlinfundamentals

fun main() {
    val anotherLoveSong = Song("Another Love", "Tom Odell", 2013, 638_000_000)
    anotherLoveSong.printDesc()
    println(anotherLoveSong.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDesc() {
        println("$title,performed by $artist,was released in $yearPublished. ")
    }
}
