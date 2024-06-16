package org.example.javaCode.memento.textEditor;

public class Runner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Like you stupid shit");
        editor.write("Like you stupid shit and asshole");
        editor.write("Like you stupid shit and asshole to the end!!!");

        System.out.println(editor);

        editor.undo();

        System.out.println(editor);
    }
}
