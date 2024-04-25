package org.example.kotlinCode.Bridge.scoring

class TestScoring {
    companion object {
        fun run() {
            val creditPolicy = USCreditPolicy(UsScoring())
            println(creditPolicy.getDecision("Ass"))
        }
    }
}