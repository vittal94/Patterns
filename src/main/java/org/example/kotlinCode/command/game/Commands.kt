package org.example.kotlinCode.command.game

interface Command {
    fun executeCommand()
    fun undoPrevious()
}

abstract  class AbstractCommand(protected val game: Game) : Command

class GameStopCommand(game: Game) : AbstractCommand(game) {
    override fun executeCommand() {
        println("Finishing the game.")
        game.stop()
    }

    override fun undoPrevious() {
        println("Undoing the stop command.")
        game.start()
        game.displayScore()
    }
}

class GameStartCommand(game: Game) : AbstractCommand(game) {
    override fun executeCommand() {
        println("Starting the game.")
        game.start()
    }

    override fun undoPrevious() {
        println("Undoing the start command.")
        game.stop()
        game.displayScore()
    }

}