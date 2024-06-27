package org.example.kotlinCode.strategy.bookStore

data class Book(val title: String,val price: Double)

data class Customer(val name: String, val memberShip: MemberShipType)

enum class MemberShipType { REGULAR, PREMIUM }

class DiscountCalculator1 {
    fun calculateDiscount(book: Book, customer: Customer): Double {
        return if(customer.memberShip == MemberShipType.REGULAR)
            book.price * 0.1
        else
            book.price * 0.2
    }
}

//using strategy pattern

interface DiscountStrategy {
    fun calculateDiscount(book: Book): Double
}

class RegularCustomerDiscount : DiscountStrategy {
    override fun calculateDiscount(book: Book): Double {
        return book.price * 0.1
    }
}

class PremiumCustomerDiscount : DiscountStrategy {
    override fun calculateDiscount(book: Book): Double {
        return book.price * 0.2
    }
}
 class DiscountCalculator2(private val discount: DiscountStrategy) {
     fun calculateDiscount(book: Book): Double {
         return discount.calculateDiscount(book)
     }
 }

fun main() {
    val discountCalculator = DiscountCalculator2(PremiumCustomerDiscount())
    discountCalculator.calculateDiscount(Book("Terminator", 34.00))

    val discountCalculator2 = DiscountCalculator2(RegularCustomerDiscount())
    discountCalculator2.calculateDiscount(Book("Titanic", 3.4))
}
