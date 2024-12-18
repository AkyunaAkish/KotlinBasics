package com.example.kotlinbasics.bankaccountprogram

fun main() {
    val qBankAccount = BankAccount("Q", 118000.56)

    qBankAccount.deposit(2000.00)

    qBankAccount.withdraw(1000.00)
    
    println("Q Balance: ${qBankAccount.getBalance()}")

    val saraBankAccount = BankAccount("Sara", 0.0)
    saraBankAccount.deposit(100.00)
    saraBankAccount.withdraw(10.00)
    saraBankAccount.deposit(300.00)
    saraBankAccount.displayTransactionHistory()
    println("Sara Balance: ${saraBankAccount.getBalance()}")
}