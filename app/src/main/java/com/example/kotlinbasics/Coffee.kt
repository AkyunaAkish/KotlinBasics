package com.example.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main() {
    val coffeeForQ = CoffeeDetails(3, "Q", "XL", 3)
    makeCoffee(coffeeForQ)
}

fun add(num: Int, num2: Int): Int {
    return num + num2
}

fun divide(num: Int, num2: Int): Double {
    return (num / num2).toDouble()
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee has 1 spoon of sugar. The order is for ${coffeeDetails.name}. Cream: ${coffeeDetails.creamAmount}")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee has no spoons of sugar. The order is for ${coffeeDetails.name}. Cream: ${coffeeDetails.creamAmount}")
    } else {
        println("Coffee has ${coffeeDetails.sugarCount} spoons of sugar. The order is for ${coffeeDetails.name}. Cream: ${coffeeDetails.creamAmount}")
    }
}
