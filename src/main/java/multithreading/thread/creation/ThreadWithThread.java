package multithreading.thread.creation;

public class ThreadWithThread extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " Thread is running....");
    }

    public static void main(String[] args) {
        ThreadWithThread threadWithThread = new ThreadWithThread();
        threadWithThread.start();
        System.out.println("Bye Bye!! " + Thread.currentThread().getName());
    }
}
