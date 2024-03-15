class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("\nThread started implementation 1");
    }
}

public class CreateThread_Example1 {
    public static void main(String[] args) {
        // Approach 1 of creating threads
        MyThread thread1 = new MyThread();
        thread1.start();

        // Approach 2 of creating threads
        Thread thread2 = new Thread(() -> {
            System.out.println("\nThread started implementation 2");
        });
        thread2.start();

        // Approach 3 of creating threads
        Runnable objRunnable = () -> {
            System.out.println("\nThread started implementation 3 using runnable");
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println("Thread state: " + Thread.currentThread().getState());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 completed!!");
        };
        Thread thread3 = new Thread(objRunnable, "Runnable Thread");
        thread3.start();

        System.out.println("Main thread completed!!");
    }
}