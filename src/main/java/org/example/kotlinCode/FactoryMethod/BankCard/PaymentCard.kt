package org.example.kotlinCode.FactoryMethod.BankCard

interface PaymentCard {
    fun deposit(amount: Int): Boolean
    fun withdraw(amount: Int): Boolean
    fun checkBalance(): Int
}