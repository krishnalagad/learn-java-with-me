package LLD.Behavioural_Design_Pattern.Momento_Design_Pattern;

import java.util.Stack;

class Caretaker {
    // It manages TextEditor mementos (snapshots of the Editor states.)
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (history.isEmpty())  {
            System.out.println("Text editor has nothing to undo...");
        } else {
            // EditorMemento peek = history.peek();
            history.pop();
            editor.restore(history.peek());
        }
    }
}