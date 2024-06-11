package org.example.kotlinCode.mediator.chatServer

import java.time.LocalDateTime

class ChatServer1(internal val employees: MutableList<Employee1> = mutableListOf()) {
    internal var text: Text? = null

    fun registerEmployee(employee: Employee1) {
        employees.add(employee)
    }

    fun registerText(text: Text) {
        this.text = text
    }

    fun displayEmployees() {
        println("At present, the registered employees are:")
        for(emp in employees) println(emp.name)
    }

    fun postMessage(fromEmp: Employee1, toEmp: Employee1, msg: String) {
        //Include some validation logic if necessary

        //Post the message
        println("${fromEmp.name} posts: $msg at: ${LocalDateTime.now()}")
        text?.makeDefaultColor()
        toEmp.receiveMessage(fromEmp,msg)

        //Some logic (skipped) to ensure that the message is received and read.
        text?.makeBlueText()
    }
}

class Employee1(private val chatServer: ChatServer1,  val name: String) {
    init{chatServer.registerEmployee(this)}

    fun sendMessage(toEmp: Employee1, msg: String) {
        chatServer.postMessage(this,toEmp,msg)
    }

    fun receiveMessage(fromEmp: Employee1, msg: String) {
        println("$name has read ${fromEmp.name}'s message now.")
    }
}

class Text(private val chatServer: ChatServer1, private val color: String) {
    init{chatServer.registerText(this)}
    fun makeDefaultColor() {
        println("Message text has default color $color")
    }

    fun makeBlueText() {
        println("***Message text becomes blue.***\n")
    }
}

fun main() {

    val chatServer = ChatServer1()

    val amit = Employee1(chatServer, "Amit")
    val sohel = Employee1(chatServer, "Sohel")
    val kate = Employee1(chatServer, "Kate")

    val text = Text(chatServer,"black")

    println("\nCommunication starts among participants...")
    amit.sendMessage(sohel, "Hi sohel, can we discuss the mediator pattern?")

    sohel.sendMessage(amit, "Hi Amit, yes, we can discuss now.")
    amit.sendMessage(kate, "Hi Kate!")

}