package LLD.Behavioural_Design_Pattern.Momento_Design_Pattern;

class EditorMemento {
    private final String content;

    // Stores the internal states of Editor
    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
