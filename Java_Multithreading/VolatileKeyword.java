class SharedResource {
    private volatile boolean flag;  // use volatile to avoid thread stuck issue or use synchronized in getters and setters

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class VolatileKeyword {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Thread 1
        new Thread(() -> {
            System.out.println("Thread 1 started!!");
            try {
                System.out.println("Thread 1 logic started!!");
                Thread.sleep(2000);
                System.out.println("Thread 1 logic completed!!");
                sharedResource.setFlag(true);
                System.out.println("Flag set to true by thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "Runnable thread 1").start();

        // Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 started");
            while (!sharedResource.isFlag()) {
                // It will run until flag is set to true by thread 1.
            }
            sharedResource.setFlag(false);
            System.out.println("Flag set to false by thread 2");
        }, "Runnable thread 2").start();
    }
}