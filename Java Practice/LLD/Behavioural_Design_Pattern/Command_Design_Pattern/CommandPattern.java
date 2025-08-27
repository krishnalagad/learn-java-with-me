package LLD.Behavioural_Design_Pattern.Command_Design_Pattern;

import org.w3c.dom.Text;

// Command Interface
interface Command {
    void execute();
}

// Concrete class: BoldCommand
class BoldCommand implements Command {
    private final TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        this.textEditor.boldText();
    }
}

// Concrete class: ItalicCommand
class ItalicCommand implements Command {
   private final TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.italicizeText();
    }
}

class UnderlineCommand implements Command {
    private final TextEditor textEditor;

    public UnderlineCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.underlineText();
    }
}

// Button Class: It is Invoker.
class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
}

// TextEditor is Receiver.
class TextEditor {
    public void boldText() {
        System.out.println("Bold Text");
    }

    public void italicizeText() {
        System.out.println("Italic Text");
    }

    public void underlineText() {
        System.out.println("Underline Text");
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Create Button: Bold
        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();

        // Create Button: Italic
        Button button1 = new Button();
        button1.setCommand(new ItalicCommand(textEditor));
        button1.click();

        // Create Button: Underline
        Button button2 = new Button();
        button2.setCommand(new UnderlineCommand(textEditor));
        button2.click();
    }
}
