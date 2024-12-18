package com.example.kotlinbasics

fun main() {
    println("Please enter a number")
    try {
        val number = readln().toInt()
        println("User entered: $number")
    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
    } finally {
        println("This will be executed regardless of whether there was an error or not")
    }
}