package multithreading.executor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class L12_CyclicBarrier {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystems are up and running. System startup completed!!");
            }
        });

        Thread webServerThread = new Thread(new Subsystem("Web Server", 1000, barrier));
        Thread databaseThread = new Thread(new Subsystem("Database", 5000, barrier));
        Thread cacheThread = new Thread(new Subsystem("Cache", 4000, barrier));
        Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service", 4000, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();

    }
}

class Subsystem implements Runnable {
    private final String name;
    private final int initializationTime;
    private final CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " Initialization Started !!");
            Thread.sleep(initializationTime);   // Simulate initialization time taken
            System.out.println(name + " Initialization completed !!");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
