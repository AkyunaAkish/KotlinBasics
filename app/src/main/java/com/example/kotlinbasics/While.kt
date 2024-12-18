package com.example.kotlinbasics

fun main() {
        println("Write something")
    var userInput = readln()

    while (userInput == "1") {
        println("Write something other than 1")
        userInput = readln()
    }

    println("loop is done")
}

//fun main() {
//    var count = 0
//
//    while (count < 3) {
//        println("Count is $count")
//        count++
//    }
//
//    println("loop is done")
//}