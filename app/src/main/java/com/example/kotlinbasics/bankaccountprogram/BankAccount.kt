package com.example.kotlinbasics.bankaccountprogram

class BankAccount(var accountHolder: String, private var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("${accountHolder} deposited: $$amount. New balance is: ${getBalance()}")
    }

    fun withdraw(amount: Double) {
        if (getBalance() >= amount) {
            balance -= amount
            transactionHistory.add("${accountHolder} withdrew: $$amount. New balance is: ${getBalance()}")
        } else {
            println("Insufficient funds")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction History for $accountHolder")

        for (index in 0 until transactionHistory.size) {
            println("Transaction: ${transactionHistory[index]}")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}