package com.example.kotlinbasics

fun main() {
    println("Enter rock, paper, or scissors")

    var playerChoice: String = readln().lowercase().trim()

    if (playerChoice.isEmpty()) {
        println("You didn't enter anything")
        return
    }

    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("You didn't enter a valid option, try again")
        playerChoice = readln().lowercase().trim()
    }

    val randomNumber = (1..3).random()

    val computerChoice = when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        3 -> "scissors"
        else -> "rock"
    }

    println("Computer chose $computerChoice")

    val outcome = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "You Win"
        playerChoice == "paper" && computerChoice == "rock" -> "You Win"
        playerChoice == "scissors" && computerChoice == "paper" -> "You Win"
        else -> "Computer wins"
    }

    println("Game result: $outcome")
}