package org.example.kotlinCode.visitor.html

class HTMLOrderViewCreator : OrderVisitor {
    var html: String = ""
        private set

    override fun visit(order: Order) {
       html = "order"
    }

    override fun visit(specialOrder: SpecialOrder) {
        html = "specialOrder"
    }
}