import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student = new Student("Krishna Lagad", "krishna@gmail.com", 22, "Pune");

        // write data to file.
        FileOutputStream fos = new FileOutputStream("out.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);

        oos.close();
        fos.close();
        System.out.println("Object serialized and stored oin file.");
    }
}
