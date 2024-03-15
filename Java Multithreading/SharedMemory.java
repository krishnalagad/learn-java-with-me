public class SharedMemory {
    public static Object sharedObject = new Object();
    public static void main(String[] args) {
        // 1st runnable thread
        Runnable objRunnable1 = () -> {
            System.out.println("Thread 1 started");
            System.out.println("Name of thread: " + Thread.currentThread().getName());
            System.out.println("State of thread: " + Thread.currentThread().getState());
            System.out.println("Shared memory: " + sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 completed successfully!!");
        };
        Thread thread1 = new Thread(objRunnable1, "Runnable thread 1");
        thread1.start();

        // 2nd runnable thread
        Runnable objRunnable2 = () -> {
            System.out.println("Thread 2 started");
            System.out.println("Name of thread: " + Thread.currentThread().getName());
            System.out.println("State of thread: " + Thread.currentThread().getState());
            System.out.println("Shared memory: " + sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 completed successfully!!");
        };
        Thread thread2 = new Thread(objRunnable2, "Runnable thread 2");
        thread2.start();
    }
}