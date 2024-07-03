package org.example.kotlinCode.templateMethod.dayRoutine

abstract class DayRoutine {
    fun runSchedule() {
        arriveToWork()
        drinkCoffee()
        doBeforeLunch()
        goToLunch()
        doAfterLunch()
        goHome()
    }

    private fun arriveToWork() {
        println("Arriving to fucking work...")
    }
    private fun drinkCoffee() {
        println("Drinking coffee...")
    }

    private fun goHome() {
        println("Finely i go home..")
    }

    private fun goToLunch() {
        println("Going to lunch...")
    }

   protected abstract fun doAfterLunch()
   protected abstract fun doBeforeLunch()

   open fun bossHooke() {
       println("Boss can't hooke me!!!")
   }

}

class MondayRoutine : DayRoutine() {
    override fun doAfterLunch() {
        println("Monday doing thins after lunch...")
    }

    override fun doBeforeLunch() {
        println("Monday doing thins before lunch...")
    }
}

