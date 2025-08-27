package multithreading.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class L9_Runnable {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Runnable runnable = () -> System.out.println("Krishna");
            Future<String> future = executorService.submit(runnable, "Krishna" );
            System.out.println(future.get());
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
