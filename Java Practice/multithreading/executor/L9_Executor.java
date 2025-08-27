package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class L9_Executor {

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
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            executorService.submit(() -> {
                int result = factorial(finalI);
                System.out.println(result);
            });
        }
        executorService.shutdown();
        try {
            boolean b = executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - start));

    }
}
