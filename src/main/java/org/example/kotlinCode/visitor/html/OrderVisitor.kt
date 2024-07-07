package org.example.kotlinCode.visitor.html

interface OrderVisitor {
    fun visit(order: Order)
    fun visit(specialOrder: SpecialOrder)
}