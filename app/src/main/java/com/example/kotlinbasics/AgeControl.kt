package com.example.kotlinbasics

fun main() {
    println("Please enter your age as a whole number")

    val enteredValue = readln()
    val age = enteredValue.toIntOrNull()

    if  (enteredValue.isEmpty()) {
        println("You didn't enter anything")
        return
    }

    if (age == null) {
        println("You didn't enter a whole number")
        return
    }

    if (age >= 40) {
        println("You are too old for da club")
    } else if (age in 18..39) {
        println("You are old enough for da club")
    } else {
        println("You are too young for da club")
    }

    return
}