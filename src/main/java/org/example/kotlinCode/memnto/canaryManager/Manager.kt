package org.example.kotlinCode.memnto.canaryManager

class Manager {
    private var thoughts = mutableListOf<String>()

    fun think(thought: String) {
        thoughts.add(thought)
        if(thoughts.size > 2) thoughts.removeFirst()
    }

    fun saveThatThought(): Memory {
        return Memory(thoughts.toList())
    }

    fun `what was I thinking back then?`(memory: Memory) {
        memory.restore()
    }

    override fun toString(): String {
        return thoughts.toString()
    }

    inner class Memory(private val mindState: List<String>) {
        fun restore() {
            thoughts = mindState.toMutableList()
        }
    }
}

fun main() {
    val manager = Manager()
    manager.think("Need to implement Coconut Cannon.")
    manager.think("Should get some coffee.")

    println("Saving first two thoughts of manager: $manager")
    val memento = manager.saveThatThought()

    manager.think("Or maybe tea?")
    manager.think("No, actually let's implement Pineapple.")
    println("After adding the new thoughts, old thoughts are removed: $manager")

    manager.`what was I thinking back then?`(memento)
    println("After restoring the old thoughts: $manager")
}