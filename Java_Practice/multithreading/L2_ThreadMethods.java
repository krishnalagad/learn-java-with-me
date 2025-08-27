package multithreading;

class MyThread4 extends Thread {
    public MyThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Inside Thread: " + Thread.currentThread().getName());
        }
    }
}
class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String raw = "";
            for (int j = 0; j < 10000; j++) {
                raw += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority()
                    + " - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class L2_ThreadMethods {
    public static void main(String[] args) {
        MyThread2 l = new MyThread2("Low Priority");
        MyThread2 m = new MyThread2("Medium Priority");
        MyThread2 h = new MyThread2("High Priority");

        l.setPriority(4);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
        System.out.println();

        MyThread3 t1 = new MyThread3("t1");
        t1.start();
//        t1.interrupt();
        MyThread3 t2 = new MyThread3("t2");
        t2.start();

        MyThread4 userThread = new MyThread4("UserThread");
//        userThread.start();
        MyThread4 demonThread = new MyThread4("DemonThread");
        demonThread.setDaemon(true);
        demonThread.start();
        System.out.println("Main Thread ended");
    }
}
