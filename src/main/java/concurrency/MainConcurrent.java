package concurrency;


public class MainConcurrent {

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.setName(String.valueOf(i));
            thread.start();

        }
            System.out.println("Main thread: is Runing");

    }
}
