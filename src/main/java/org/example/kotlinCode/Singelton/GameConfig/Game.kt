package org.example.kotlinCode.Singelton.GameConfig

object GameConfig {
    private val TAG = GameConfig::class.simpleName
     var latency = 1000
     var waitingGamers = 0
     var heroesPull = 150
     var title = ""

    fun printConfig() {
        println("TAG: $TAG," +
                " latency: $latency," +
                " waitingGamers: $waitingGamers," +
                " heroesPull: $heroesPull," +
                " title: $title." )
    }
}

fun testGameConfig() {
    GameConfig.title = "tetris"
    GameConfig.printConfig()
    GameConfig.heroesPull = 450
    GameConfig.printConfig()
}

