package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdrawWithLock(int amount) {
        try {
            System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
            if (this.lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (this.balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing withdrawal request.");
                        Thread.sleep(5000);
                        this.balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal, remaining balance " + this.balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        this.lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (this.balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal, remaining balance " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}
public class L4_Locks {
    public static void main(String[] args) {
        BankAccount hdfc = new BankAccount();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                hdfc.withdrawWithLock(50);
            }
        };

        Thread t1 = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");
        t1.start();
        t2.start();
    }
}
