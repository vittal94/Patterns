package org.example.kotlinCode.Bridge.scoring

interface Scoring {
    fun perform(client: String): ScoringResult
}