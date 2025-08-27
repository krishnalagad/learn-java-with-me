package LLD.Behavioural_Design_Pattern.Momento_Design_Pattern;

class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(); // manages the states of the text editor.

        editor.write("1st Message");
        caretaker.saveState(editor);

        editor.write("2nd Message");
        caretaker.saveState(editor);

        editor.write("3rd Message");
        caretaker.saveState(editor);

        caretaker.undo(editor);
        caretaker.undo(editor);
//        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}