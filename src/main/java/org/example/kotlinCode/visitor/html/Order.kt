package org.example.kotlinCode.visitor.html

open class Order : Visitable<OrderVisitor> {
    override fun accept(visitor: OrderVisitor) {
        visitor.visit(this)
    }
}