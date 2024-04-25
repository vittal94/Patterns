package org.example.kotlinCode.FactoryMethod.BankCard



class VisaCardFactory : CardFactory {
    override fun createCard(): PaymentCard {
        return Visa()
    }
}


class MasterCardFactory : CardFactory {
    override fun createCard(): PaymentCard {
        return MasterCard()
    }

}