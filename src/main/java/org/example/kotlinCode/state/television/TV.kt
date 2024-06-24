package org.example.kotlinCode.state.television

import org.example.javaCode.Bridge.seller.TV

interface TVState {
    fun pressOn(tv: Television)
    fun pressOff(tv: Television)
    fun pressMute(tv: Television)
}

class OnState : TVState {
    override fun pressOn(tv: Television) {
        println("TV is already on, so ignore this command")
    }

    override fun pressOff(tv: Television) {
        println("TV is turning off")
        tv.state = OffState()
    }

    override fun pressMute(tv: Television) {
        println("TV is in  muting mode ")
        tv.state = MuteState()
    }
}

class OffState : TVState {
    override fun pressOn(tv: Television) {
        println("TV is turning on")
        tv.state = OnState()
    }

    override fun pressOff(tv: Television) {
        println("TV is already in off, so ignore this command")
    }

    override fun pressMute(tv: Television) {
        println("TV is in off state, so it cannot be muted")
    }
}

class MuteState : TVState {
    override fun pressOn(tv: Television) {
        println("TV is already in on mode and muted, so ignore this command")
    }

    override fun pressOff(tv: Television) {
        println("TV is turning off")
        tv.state = OffState()
    }

    override fun pressMute(tv: Television) {
        println("TV is already in a mute mode, so ignore this command")
    }
}

class Television (var state: TVState = OffState()) {

    fun executeOn() {
        println("You pressed the on button")
        state.pressOn(this)
    }

    fun executeOff() {
        println("You pressed the Off button")
        state.pressOff(this)
    }

    fun executeMute() {
        println("You pressed the mete button")
        state.pressMute(this)
    }
}

fun main() {
    val tv = Television()
    tv.executeOn()
    tv.executeMute()
    tv.executeOn()
    tv.executeOff()
}