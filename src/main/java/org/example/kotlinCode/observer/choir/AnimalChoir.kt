package org.example.kotlinCode.observer.choir

typealias Times = Int

class Bat {
    fun screech() {
        println("Eeeeee!!!")
    }
}

class Turkey {
    fun gobble() {
        println("Gob- gob!!!")
    }
}

class Dog {
    fun bark() {
        println("Woof!!!!")
    }

    fun howl() {
        println("Auuuu!!!!")
    }
}

class Cat {
    private val participants = mutableMapOf<() -> Unit, () -> Unit>()

    fun joinChoir(whatToCall: () -> Unit) {
        participants[whatToCall] = whatToCall
    }

    fun leaveChoir(whatToCall: () -> Unit) {
        participants.remove(whatToCall)
    }

    fun conduct(n: Times) {
        for(p in participants.values) {
            for(i in 1..n) {
                p()
            }
        }
    }
}

fun main() {
    val bat = Bat()
    val dog = Dog()
    val turkey = Turkey()

    val conductor = Cat()

    conductor.joinChoir(bat::screech)
    conductor.joinChoir(dog::bark)
    conductor.joinChoir(turkey::gobble)

    conductor.conduct(3)
}
