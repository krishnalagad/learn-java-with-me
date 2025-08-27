package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Demo {
    private Lock lock = new ReentrantLock(true);
    public void accessResource() {
        this.lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            this.lock.unlock();
        }
    }
}
public class L5_FairLock {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                demo.accessResource();
            }
        };

        Thread t1 = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");
        Thread t3 = new Thread(runnable, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
