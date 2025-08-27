package multithreading;

class Counter {
    private int count;

    public synchronized void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}

class MyThread5 extends Thread {
    private final Counter counter;
    public MyThread5(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.counter.increment();
        }
    }
}

public class L3_Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread5 t1 = new MyThread5(counter);
        MyThread5 t2 = new MyThread5(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
