package org.example.kotlinCode.Prototype.Deposit

import java.time.Period

data class Deposit(
    var name: String = "Default deposit",
    var type: String = "Saving deposit",
    var timePeriod: Period = Period.ofMonths(12),
    var percent: Int = 10
)

fun testDeposit()
{
    val deposit = Deposit()

    //create the copy of deposit but change the time period
    //using the data class's copy method you can override some properties like time period
    val customDeposit = deposit.copy(timePeriod = Period.ofMonths(24))
}