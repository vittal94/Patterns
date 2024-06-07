package org.example.kotlinCode.iterator.squad

interface Trooper {
    fun move(x: Long, y: Long)
    fun attackRebel(x: Long, y: Long)
    fun retreat()
}

class StormTrooper(private val name: String) : Trooper{
    override fun move(x: Long, y: Long) {
        println("Trooper $name move by $x $y")
    }

    override fun attackRebel(x: Long, y: Long) {
        println("Trooper $name attacking rebel by $x $y")
    }

    override fun retreat() {
        println("Trooper $name retreating!!!")
    }

    override fun toString(): String {
        return "StormTrooper $name"
    }

}

class Squad(private val units: List<Trooper>) : Trooper {
    constructor(vararg units: Trooper) : this(units.toList())

    operator fun iterator() = object: Iterator<Trooper> {
        private var index = 0
        override fun hasNext(): Boolean {
            return index < units.size
        }

        override fun next(): Trooper {
            return units[index++]
        }
    }

    override fun move(x: Long, y: Long) {
        for(u in units)
            u.move(x,y)
    }

    override fun attackRebel(x: Long, y: Long) {
        for(u in units)
            u.attackRebel(x,y)
    }

    override fun retreat() {
        for(u in units)
            u.retreat()
    }

    override fun toString(): String {
        return "Squad(units=$units)"
    }

}

fun main() {
    val platoon = Squad(
        StormTrooper("Ivan"),
        Squad(
            StormTrooper("Evgen"),
            StormTrooper("Mash"),
        ),
        StormTrooper("asshole")
    )

    for(p in platoon) println(p)
}