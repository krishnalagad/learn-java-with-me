package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock= lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return this.count;
        } finally {
            readLock.unlock();
        }
    }
}
public class L6_ReadWriteLock {
    public static void main(String[] args) {
        ReadWriteCounter readWriteCounter = new ReadWriteCounter();
        Runnable writeRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    readWriteCounter.increment();
                    System.out.println(Thread.currentThread().getName() + " - incremented counter.");
                }
            }
        };

        Runnable readRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + readWriteCounter.getCount());
                }
            }
        };

        Thread writeThread = new Thread(writeRunnable, "WriteThread");
        Thread readThread1 = new Thread(readRunnable, "ReadThread1");
        Thread readThread2 = new Thread(readRunnable, "ReadThread2");

        writeThread.start();
        readThread1.start();
        readThread2.start();
    }
}
