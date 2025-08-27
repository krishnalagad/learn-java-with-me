package LLD.Behavioural_Design_Pattern.TemplateMethod_Design_Pattern;

// Abstract class for template methods
abstract class DataParser {
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected abstract void parseData();

    protected void openFile() {
        System.out.println("Opening File!!");
    }

    protected void closeFile() {
        System.out.println("Closing File!!");
    }
}

// Child classes
class CSVParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}

class JSONParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
}

public class TemplateMethodPattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        DataParser jsonParser = new JSONParser();

        csvParser.parse();
        jsonParser.parse();
    }
}
