package org.example.kotlinCode.Bridge.scoring

class USCreditPolicy(private val scoring: Scoring) : CreditPolicy(scoring) {
    override fun getDecision(client: String): Boolean {
        return scoring.perform(client) >= US_SCORING_RESULT_TO_APPROVE
    }
}