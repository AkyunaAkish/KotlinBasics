package com.example.kotlinbasics

fun main() {
//    val fruitList = mutableListOf("Banana", "Strawberry", "Blackberry", "Pineapple", "Mango")
//    fruitList.add("Acai")
//    fruitList.remove("Blackberry")

    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (index in 0 until numbers.size) {
        numbers[index] = numbers[index] * 2
    }

    println(numbers)
}