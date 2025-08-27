package LLD.Singleton;

import java.io.*;

public class SingletonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Singleton instance1 = Singleton.getInstance();
//        Object clone = instance1.clone();
//        Singleton instance2 = Singleton.getInstance();

        // serialize singleton object to file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serializer.ser"));
        outputStream.writeObject(instance1);
        outputStream.close();

        // deserialize singleton object from file.
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serializer.ser"));
        Singleton instance2 = (Singleton) inputStream.readObject();
        inputStream.close();

        System.out.println("instance1: " + instance1.hashCode());
        System.out.println("instance2: " + instance2.hashCode());

    }
}
