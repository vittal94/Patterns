package org.example.kotlinCode.state.tcp

import kotlin.math.sin

interface  TCPState {
    fun open()
    fun close()
    fun acknowledge()
}

class TCPEstablished : TCPState {
    override fun open() {
        println("TCPEstablished::open")
    }

    override fun close() {
        println("TCPEstablished::close")
    }

    override fun acknowledge() {
        println("TCPEstablished::acknowledge")
    }
}

class TCPListen : TCPState {
    override fun open() {
        println("TCPListen::open")
    }

    override fun close() {
        println("TCPListen::close")
    }

    override fun acknowledge() {
        println("TCPListen::acknowledge")
    }
}

class TCPClosed : TCPState {
    override fun open() {
        println("TCPClosed::open")
    }

    override fun close() {
        println("TCPClosed::close")
    }

    override fun acknowledge() {
        println("TCPClosed::acknowledge")
    }
}

class TCPConnection : TCPState {
    private var state: TCPState = TCPListen()

    override fun open() {
  state.open()
    }

    override fun close() {
        state.close()
    }

    override fun acknowledge() {
        state.acknowledge()
    }

    fun changeState() {
        when (state) {
            is TCPListen -> { state = TCPEstablished(); return }
            is TCPEstablished -> { state = TCPClosed(); return }
            else -> state = TCPListen()
        }
    }
}

fun main() {
    val connection = TCPConnection()
    connection.open()
    connection.changeState()
    connection.acknowledge()
}