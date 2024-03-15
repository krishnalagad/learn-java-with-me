public class InheritableThreadLocalExample {
    public static void main(String[] args) throws InterruptedException {
        InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

        // Parent thread 
        Thread thread1 = new Thread(() -> {
            System.out.println("Parent thread started!!");
            threadLocal.set("Krishna");

            // Child thread
            Thread childThread = new Thread(() -> {
                System.out.println("Child thread started!!");

                String val = threadLocal.get();
                System.out.println("Inherited value from parent thread: " + val);
                threadLocal.remove();

                System.out.println("Child thread stopped!!");
            }, "Child Thread");
            childThread.start();

            // join the child thread
            try {
                childThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Parent thread stopped!!");
        }, "Parent Thread");
        thread1.start();

        // join the parent thread
        thread1.join();
    }
}