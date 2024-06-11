package org.example.kotlinCode.mediator.airControlTower

interface AirTrafficController {
    fun registerAirplane(airplane: Airplane)
    fun deregisterAirplane(airplane: Airplane)
    fun requestTakeOff(airplane: Airplane)
    fun requestLanding(airplane: Airplane)
}

class Airplane(private val registrationNumber: String, private val controller: AirTrafficController) {
    fun takeOff() {
        println("$registrationNumber is requesting takeoff.")
        controller.requestTakeOff(this)
    }

    fun land() {
        println("$registrationNumber is requesting landing.")
        controller.requestLanding(this)
    }

    fun notifyTakeOff() {
        println("$registrationNumber has taken off")
        controller.deregisterAirplane(this)
    }

    fun notifyLanding() {
        println("$registrationNumber has landed.")

    }
}

class AirTrafficControlTower : AirTrafficController {
    private val registeredAirplanes: MutableSet<Airplane> = mutableSetOf()

    override fun registerAirplane(airplane: Airplane) {
        registeredAirplanes.add(airplane)
    }

    override fun deregisterAirplane(airplane: Airplane) {
        registeredAirplanes.remove(airplane)
    }

    override fun requestTakeOff(airplane: Airplane) {
        if(registeredAirplanes.contains(airplane))
            airplane.notifyTakeOff()
    }

    override fun requestLanding(airplane: Airplane) {
        if(!registeredAirplanes.contains(airplane))
            airplane.notifyLanding()
    }
}

fun main() {
    val controlTower = AirTrafficControlTower()

    val airplane1 = Airplane("43h", controlTower)
    val airplane2 = Airplane("45h", controlTower)
    val airplane3 = Airplane("47u",controlTower)
    val airplane4 = Airplane("67r", controlTower)

    controlTower.registerAirplane(airplane1)
    controlTower.registerAirplane(airplane2)
    controlTower.registerAirplane(airplane3)
    controlTower.registerAirplane(airplane4)

    airplane4.takeOff()
    airplane4.notifyTakeOff()

    airplane3.land()
    airplane3.notifyLanding()
}