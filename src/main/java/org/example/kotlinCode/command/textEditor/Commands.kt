package org.example.kotlinCode.command.textEditor

interface Command {
    fun execute()
    fun undo()
}

class CutCommand(private val receiver: TextEditor, private val clipboard: Clipboard) : Command {
    override fun execute() {
        clipboard.content = receiver.cut()
    }

    override fun undo() {
        receiver.write(clipboard.content)
        clipboard.content = ""
    }
}

class CopyCommand(private val receiver: TextEditor, private val clipboard: Clipboard) : Command {
    override fun execute() {
      clipboard.content = receiver.copy()
    }

    override fun undo() {
       clipboard.content = ""
    }
}

class PastCommand(private val receiver: TextEditor, private val clipboard: Clipboard) : Command {
    override fun execute() {
        receiver.write(clipboard.content)
    }

    override fun undo() {
        receiver.delete(clipboard.content)
    }

}