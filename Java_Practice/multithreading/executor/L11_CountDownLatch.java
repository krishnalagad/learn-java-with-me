package multithreading.executor;

import java.util.concurrent.*;

public class L11_CountDownLatch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfTimes = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfTimes);
        CountDownLatch countDownLatch = new CountDownLatch(numberOfTimes);

        Future<String> future1 = executorService.submit(new DependantTask(countDownLatch));
        Future<String> future2 = executorService.submit(new DependantTask(countDownLatch));
        Future<String> future3 = executorService.submit(new DependantTask(countDownLatch));

//        future1.get();
//        future2.get();
//        future3.get();

        countDownLatch.await(5, TimeUnit.SECONDS);
        System.out.println(Thread.currentThread().getName() + " Started working !!");
        executorService.shutdown();
    }
}

class DependantTask implements Callable<String> {

    private final CountDownLatch latch;

    DependantTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " Started working !!");
        } finally {
            latch.countDown();
        }
        return "ok";
    }
}
