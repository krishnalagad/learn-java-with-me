public class ThreadLocalExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Long> threadLocalValue = new ThreadLocal<>();

        Long userId1 = 1000023L;
        Long userId2 = 1000024L;

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread for user 1 started");
            threadLocalValue.set(userId1);
            System.out.println("Thread of user 1 with iD: " + threadLocalValue.get());
            threadLocalValue.remove();
            System.out.println("Removed: " + threadLocalValue.get());
        }, "User 1 Thread");

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread for user 2 started");
            threadLocalValue.set(userId2);
            System.out.println("Thread of user 2 with iD: " + threadLocalValue.get());
            threadLocalValue.remove();
            System.out.println("Removed: " + threadLocalValue.get());
        }, "User 2 Thread");

        // start the threads
        thread1.start();
        thread2.start();

        // wait for threads to finish
        thread1.join();
        thread2.join();
    }
}