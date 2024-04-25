package org.example.kotlinCode.FactoryMethod.BankCard

class Visa  : PaymentCard {
    private var balance: Int = 0

    override fun deposit(amount: Int): Boolean {
        println("Visa card making deposit of $amount")
        balance += amount
        return true
    }

    override fun withdraw(amount: Int): Boolean {
        println("Visa card making withdrawal of $amount")
        if (balance < amount) return false
        balance -= amount
        return true
    }

    override fun checkBalance(): Int {
        return balance
    }
}

class MasterCard : PaymentCard {
    private var balance: Int = 0

    override fun deposit(amount: Int): Boolean {
        println("Master card making deposit amount of $amount")
        balance += amount
        return true
    }

    override fun withdraw(amount: Int): Boolean {
        println("Master card making withdrawal amount of $amount")
        if (balance < amount) return false
        balance -= amount
        return true
    }

    override fun checkBalance(): Int {
        return balance
    }

}