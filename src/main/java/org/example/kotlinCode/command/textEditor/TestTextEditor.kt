package org.example.kotlinCode.command.textEditor

fun main() {
    val clipboard = Clipboard()
    val editor = TextEditor("Java is dead!!!")
    val invoker = TextEditorInvoker()

    invoker.executeCommand(CutCommand(editor, clipboard)) //cuts last character of initial content to clipboard
    invoker.executeCommand(CopyCommand(editor,clipboard)) //copies current content to clipboard
    invoker.executeCommand(PastCommand(editor, clipboard)) //pastes current content to text editor

    editor.print()
    invoker.undo()
    editor.print()
}