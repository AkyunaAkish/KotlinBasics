package com.example.kotlinbasics

fun main () {
    val constantNumber = 1
    var mutableString = "Sup"

    println("Mutable String: $mutableString, Constant Number: $constantNumber")

    mutableString = "Sup dude"

    println("Mutable String next: $mutableString, Constant Number: $constantNumber")
}