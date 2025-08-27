package multithreading.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class L9_ThreadArray {

    public static int factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[10];
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(() -> {
                int result = factorial(finalI);
                System.out.println(result);
            }, "Thread" + finalI);
            threads[i - 1].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - start));
    }
}
