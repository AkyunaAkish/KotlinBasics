package com.example.kotlinbasics

fun main() {
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")

    shoppingList.add("Cooling System")
    shoppingList.removeAt(2)
    shoppingList.add("Graphics Card RTX 4090")
    shoppingList.add(2, "Webcam")

//    shoppingList.set(1, "SET REPLACE") // prefer shoppingList[1] = <>
    println("shopping list ${shoppingList}")
    println("Contains webcam? ${shoppingList.contains("Webcam")}")

    for (index in 0 until shoppingList.size) {
        val item = shoppingList[index]
        println("Index: $index")
        println("Item: $item")
    }
}
