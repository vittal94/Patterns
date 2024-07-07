package org.example.kotlinCode.visitor.html

fun main() {
    val order: Order = Order()
    val specialOrder: Order = SpecialOrder()

    val htmlCreator = HTMLOrderViewCreator()

    order.accept(htmlCreator)
    println(htmlCreator.html)

    specialOrder.accept(htmlCreator)
    println(htmlCreator.html)
}