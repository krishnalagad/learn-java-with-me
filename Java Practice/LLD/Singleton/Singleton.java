package LLD.Singleton;

import java.io.Serial;
import java.io.Serializable;

// Thread safe singleton design pattern.
public class Singleton implements Serializable {
    private static volatile Singleton instance;
    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Singleton has already created.");
        }
    }

    // method to maintain singleton property during deserialization.
    @Serial
    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
                System.out.println("New singleton instance created!!");
            }
            return instance;
        }
        System.out.println("Singleton instance already exists!!");
        return instance;
    }
}
