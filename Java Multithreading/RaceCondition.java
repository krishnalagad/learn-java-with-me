import java.util.concurrent.atomic.AtomicInteger;

/*
 *  To avoid race conditions, use AutomicInteger which is thread safe
 *  It is non-lock based approach, it leaveraging hardware support.
 */ 
class SharedCounter1 {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        this.count.incrementAndGet();
    }

    public int getCount() {
        return this.count.get();
    }
}

/*
 *  To avoid race conditions, use synchronized keyword to the method which is operating on shared counter
 *  It is a lock based approach, it is using mutual exclusion
 */ 
class SharedCounter2 {
    private int count;

    public void increment() {
        synchronized (this) {
            this.count++;
        }
    }

    public int getCount() {
        return this.count;
    }
}

/*
 * Two threads Thread1 and Thread2 trying to increment shared counter thats why race condition occurs
 */
public class RaceCondition {
    static SharedCounter1 counter1 = new SharedCounter1();
    static SharedCounter2 counter2 = new SharedCounter2();
    public static void main(String[] args) {
        System.out.println("Initial counter value: " + counter1.getCount());

        // Thread 1
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started!!");
            for (int i = 0; i < 50000; i++) {
                counter1.increment();
            }
            System.out.println("Thread 1 finished!!");
        }, "Runnable Thread 1");

        // Thread 2
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 started!!");
            for (int i = 0; i < 50000; i++) {
                counter1.increment();
            }
            System.out.println("Thread 2 finished!!");
        }, "Runnable Thread 2");

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish    
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter1.getCount());
    }
}