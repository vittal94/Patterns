package org.example.javaCode.memento.textEditor;

public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }
    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }
    public static class Memento {
        private final String text;

        public Memento(String textToSave) {
            text = textToSave;
        }

        public String getSavedText() {
            return text;
        }
    }

    @Override
    public String toString() {
        return "TextArea: " + text;
    }
}
