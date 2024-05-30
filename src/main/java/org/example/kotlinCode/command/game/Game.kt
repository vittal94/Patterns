package org.example.kotlinCode.command.game

class Game(gameName: String) {
    var gameName = gameName
        private set

    fun start() {
        println("$gameName is on.")
    }

    fun displayScore() {
        println("The score is changing from time to time.")
    }

    fun stop() {
        println("The game of $gameName is stopped.")
    }
}

class RemoteControlInvoker(var currentCommand: Command) {
    private var lastCommandPerformed: Command? = null

    fun executeSelectedCommand() {
        currentCommand.executeCommand()
        lastCommandPerformed = currentCommand
    }

    fun undoCommand() {
        lastCommandPerformed?.undoPrevious() ?: println("There is not a previous command")
    }
}

fun main() {
    val game = Game("Basketball")
    val gameStartCommand = GameStartCommand(game)
    val gameStopCommand = GameStopCommand(game)

    val invoker = RemoteControlInvoker(gameStartCommand)
    invoker.executeSelectedCommand()
    invoker.undoCommand()

    invoker.currentCommand = gameStopCommand
    invoker.executeSelectedCommand()
    invoker.undoCommand()
}