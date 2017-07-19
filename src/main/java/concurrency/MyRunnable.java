package concurrency;


public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running: " +Thread.currentThread().getName());
    }
}
