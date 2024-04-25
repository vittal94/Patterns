package org.example.kotlinCode.FactoryMethod.BankCard

class BankApp {
    companion object {
        fun run() {
            val visaFactory: CardFactory = VisaCardFactory()
            val visa: PaymentCard = visaFactory.createCard()

            visa.let {
                it.deposit(78)
                println(it.checkBalance())
                it.withdraw(56)
                println(it.checkBalance())
            }
        }
    }
}