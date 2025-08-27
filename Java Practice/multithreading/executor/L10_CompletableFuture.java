package multithreading.executor;

import java.util.concurrent.*;

public class L10_CompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "ok";
        });
        String join = future.join();
        System.out.println(join);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(2000);
                        System.out.println("Worker 2 Thread");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return 10;
                }, executorService)
                .orTimeout(3, TimeUnit.SECONDS)
                .thenApply(x -> x * x)
                .exceptionally(msg -> -1);
        Integer integer = future1.get();
        executorService.shutdown();
        System.out.println(integer);

    }
}
