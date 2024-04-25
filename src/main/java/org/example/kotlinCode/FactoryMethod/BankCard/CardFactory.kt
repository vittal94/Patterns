package org.example.kotlinCode.FactoryMethod.BankCard

interface CardFactory {
    fun createCard(): PaymentCard
}