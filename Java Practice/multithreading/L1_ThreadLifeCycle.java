package multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread: " + "RUNNING");
        try {   // cant use 'throws' on method signature as its overridden method
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class L1_ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println("MyThread: " + thread.getState());  // NEW
        System.out.println("Main Thread: " + Thread.currentThread().getState());

        thread.start();
        System.out.println("MyThread: " + thread.getState()); // RUNNABLE
        System.out.println("Main Thread: " + Thread.currentThread().getState());

        Thread.sleep(200);
        System.out.println("MyThread: " + thread.getState());  // TIMED_WAITING
        System.out.println("Main Thread: " + Thread.currentThread().getState());

        thread.join();
        System.out.println("MyThread: " + thread.getState());  // TERMINATED
        System.out.println("Main Thread: " + Thread.currentThread().getState());
    }
}
