package LLD.Behavioural_Design_Pattern.Momento_Design_Pattern;

class TextEditor {
    private String content;

    public void write(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
    
    // save the current state of text editor
    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    // to retrieve the previous state and assign it to current state of an editor.
    public void restore(EditorMemento editor) {
        this.content = editor.getContent();
    }


}