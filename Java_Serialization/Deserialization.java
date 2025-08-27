import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("out.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        System.out.println(student);
        ois.close();
        fis.close();
    }
}
