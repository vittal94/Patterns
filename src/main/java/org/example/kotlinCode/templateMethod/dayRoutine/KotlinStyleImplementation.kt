package org.example.kotlinCode.templateMethod.dayRoutine

fun runSchedule(beforeLunch: () -> Unit,
                afterLunch: () -> Unit,
                bossHooke: (() -> Unit)? = { println() })
{
    fun arriveToWork() {
        println("Arriving to work...")
}
    fun goToLunch() {
        println("Going to lunch...")
    }
    fun goHome() {
        println("Finely going home...")
    }
    fun drinkCoffee() {
        println("Drinking coffee...")
    }
    arriveToWork()
    drinkCoffee()
    beforeLunch()
    goToLunch()
    afterLunch()
    bossHooke?.let { it() }
    goHome()
}

fun main() {
    runSchedule({ println("Monday before lunch...")},
        { println("Monday after lunch...")})
}