package threadsLecture;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by user on 10.06.2017.
 */
public class Account {
    private int balance;
    Lock lock;

    public Account(int balance) {
        this.balance = balance;
         lock = new ReentrantLock();
    }

    public void withdraw(int amount){
        lock.lock();
        try {
            balance -= amount;
        }finally {
            lock.unlock();
        }
    }

    public void deposit(int amount){
        lock.lock();
        try {
            balance += amount;
        }finally {
            lock.unlock();
        }
    }

    public int getBalance() {
        return balance;
    }

    public Lock getLock() {
        return lock;
    }
}
