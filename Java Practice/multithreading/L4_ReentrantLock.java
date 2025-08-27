package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockDemo {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Inside Outer Method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inside Inner Method");
        } finally {
            lock.unlock();
        }
    }
}
public class L4_ReentrantLock {
    public static void main(String[] args) {
        ReentrantLockDemo lockDemo = new ReentrantLockDemo();
        lockDemo.outerMethod();
    }
}
