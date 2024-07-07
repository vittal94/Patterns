package org.example.kotlinCode.visitor.html

interface Visitable<V> {
    fun accept(visitor: V)
}