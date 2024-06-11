package org.example.kotlinCode.mediator.chatServer

import java.time.LocalDate
import javax.print.DocFlavor.STRING
import kotlin.math.E

interface Mediator {
    //to register the employee
    fun register(person: Person)

    //send message from one employee to another
    fun connectEmployees(fromPerson: Person, toPerson: Person, message: String)

    //to display current registered members
    fun displayDetails()
}

class ChatServer : Mediator {
    internal val participants = mutableListOf<Person>()

    override fun register(person: Person) {
      participants.add(person)
    }

    override fun connectEmployees(fromPerson: Person, toPerson: Person, message: String) {

        //if sender is a register user
        if(participants.contains(fromPerson)) {
            // If the receiver is the registered user
            if(participants.contains(toPerson)) {
                println("${fromPerson.name} posts: $message at ${LocalDate.now()}")
                Thread.sleep(1000)
                //Target receiver receives this message
                toPerson.receiveMessage(fromPerson, message)
            } else {
                println("${fromPerson.name} you cannot send the message to ${toPerson.name}.")
                println("He/she is not a registered user.")
            }
        }
        // The message sender is not registered user.
        else {
            println("***ALERT: Everyone.***")
            println("An ${fromPerson.personType()}: ${fromPerson.name} is trying to send some messages.")
        }
         //throw InterruptedException()
    }

    override fun displayDetails() {
        println("At present, the registered employees are:")

        for( person in participants)
            println(person.name)
    }
}

abstract class Person(protected val mediator: Mediator, val name: String)  {
    fun sendMessage(toEmp: Person, msg: String) {
        mediator.connectEmployees(this,toEmp,msg)
    }

    abstract fun personType(): String

    fun receiveMessage(fromPerson: Person, msg: String) {
        println("$name has read ${fromPerson.name}'s message.")
    }
}

class Employee(mediator: Mediator, name: String) : Person(mediator, name) {
    override fun personType(): String = "Employee"
}

class Outsider(mediator: Mediator, name: String) : Person(mediator, name) {
    override fun personType(): String = "Outsider"
}

fun main() {
    val mediator = ChatServer()

    val amit = Employee(mediator, "Amit")
    val sohel = Employee(mediator, "Sohel")
    val joseph = Outsider(mediator, "Joseph")

    //Register participants
    mediator.register(amit)
    mediator.register(sohel)
    mediator.register(joseph)

    //Displaying the participant's list
    mediator.displayDetails()

    println("Communication start among participants...")
    amit.sendMessage(sohel, "Hi Sohel, can we discuss the mediator pattern?")
    amit.sendMessage(joseph, "Hi Joseph, how do you do?")
    sohel.sendMessage(amit,"Hi Amit, we can discuss now.")
    joseph.sendMessage(amit,"Hello friend.")

    //Another Employee Tod. He does not register yet
    val tod = Employee(mediator, "Tod")

    //Tod cannot send messages to registered users
    tod.sendMessage(joseph, "Hello Joseph")
}