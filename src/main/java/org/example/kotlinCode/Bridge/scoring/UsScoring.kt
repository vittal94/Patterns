package org.example.kotlinCode.Bridge.scoring

import java.util.concurrent.ThreadLocalRandom

class UsScoring : Scoring {
    override fun perform(client: String): ScoringResult {
        return ThreadLocalRandom.current().nextLong(200)
    }
}