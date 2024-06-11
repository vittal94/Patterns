package org.example.kotlinCode.mediator.airControlTower

class Airplane1(val registrationNumber: String) {
    private val otherAirplanes: MutableList<Airplane1> = mutableListOf()

    fun addAirplane(airplane: Airplane1) {
        otherAirplanes.add(airplane)
    }

    fun removeAirplane(airplane: Airplane1) {
        otherAirplanes.remove(airplane)
    }

    fun takeOff() {
        println("$registrationNumber is taking off")
        otherAirplanes.forEach {it.removeAirplane(this)}
        otherAirplanes.clear()
    }

    fun land(vararg otherAirplanes: Airplane1) {
        println("$registrationNumber is landing.")
        this.otherAirplanes.addAll(otherAirplanes)
        otherAirplanes.forEach { it.addAirplane(this) }
    }
}

fun main() {
    val airplane1  = Airplane1("43h")
    val airplane2 = Airplane1("45h")
    val airplane3  = Airplane1("47u")
    val airplane4 = Airplane1("67r")

    //all airplanes are in airport
    airplane1.land(
        airplane4,
        airplane3,
        airplane2
    )

    airplane2.land(
        airplane4,
        airplane3,
        airplane1
    )

    airplane3.land(
        airplane4,
        airplane1,
        airplane2
    )

    airplane4.land(
        airplane1,
        airplane3,
        airplane2
    )

    airplane4.takeOff()
}