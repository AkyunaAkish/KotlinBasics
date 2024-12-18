package com.example.kotlinbasics

fun main() {
    val name: String? = "Ella"

    name?.let {
        // creates confined scope
        // where we can safely use and transform name
        // without effecting the original value
        println(it.uppercase())
        println(it)


    }

    println("Name? $name")
}