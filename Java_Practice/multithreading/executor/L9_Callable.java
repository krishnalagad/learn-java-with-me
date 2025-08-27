package multithreading.executor;

import java.security.PrivilegedAction;
import java.util.List;
import java.util.concurrent.*;

public class L9_Callable {
    public static void main(String[] args) throws Exception {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Callable<String> callable = () -> "Krishna";
            Future<String> future = executorService.submit(callable);
            System.out.println(future.get());
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            PrivilegedAction<Integer> action = () -> {
                System.out.println("Task 1");
                return 1;
            };
            Integer res = action.run();
            System.out.println(res);

            Callable<Integer> callable1 = () -> {
                System.out.println("Task 2");
                return 2;
            };
            Future<Integer> submit = executorService.submit(callable1);
            System.out.println(submit.get());
        }

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Callable<Integer> callable1 = () -> {
                System.out.println("Task 1");
                return 1;
            };
            Callable<Integer> callable2 = () -> {
                System.out.println("Task 2");
                return 2;
            };
            Callable<Integer> callable3 = () -> {
                System.out.println("Task 3");
                return 3;
            };

            List<Future<Integer>> futures = executorService.invokeAll(List.of(callable1, callable2, callable3),
                    1, TimeUnit.SECONDS);
            for (Future<Integer> future : futures) {
                if (future.isDone()) {
                    System.out.println(future.get());
                }
            }
        }
    }
}
