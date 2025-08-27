package multithreading;

class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = value;
        System.out.println("Produced: " + value);
        this.hasData = true;
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.hasData = false;
        System.out.println("Consumed: " + this.data);
        notify();
        return this.data;
    }
}

class Producer implements Runnable {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable {
     private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int consume = this.sharedResource.consume();
        }
    }
}

public class L8_ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(new Producer(sharedResource), "Producer");
        Thread t2 = new Thread(new Consumer(sharedResource), "Consumer");

        t1.start();
        t2.start();
    }
}
