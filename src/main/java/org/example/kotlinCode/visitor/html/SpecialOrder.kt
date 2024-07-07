package org.example.kotlinCode.visitor.html

class SpecialOrder : Order() {
    override fun accept(visitor: OrderVisitor) {
        visitor.visit(this)
    }
}