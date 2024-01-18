package threads.example1;

public class MultipleThreads {

    /**
     * To create and start multiple threads that increment a shared counter variable concurrently.
     **/
    private static int counter = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> incrementCounter());
        Thread thread2 = new Thread(() -> incrementCounter());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);

    }

    private static synchronized void incrementCounter() {
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }
}
