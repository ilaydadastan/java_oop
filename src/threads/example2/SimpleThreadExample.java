package threads.example2;

public class SimpleThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));
        thread1.start();
        thread2.start();
    }
}
