package multithreading.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class L9_ScheduledExecutorService {
    public static void main(String[] args) {
        try (ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1)) {
            executorService.scheduleAtFixedRate(
                    () -> System.out.println("Task executed after every 2 seconds"),
                    2,
                    2,
                    TimeUnit.SECONDS);

            executorService.scheduleWithFixedDelay(
                    () -> System.out.println("Task executed after 2 seconds "),
                    2,
                    2,
                    TimeUnit.SECONDS
            );

            executorService.schedule(() -> {
                System.out.println("Initiating shutdown...");
                executorService.shutdown();
            }, 10, TimeUnit.SECONDS);
        }
    }
}

