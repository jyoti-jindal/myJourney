package multithreading.thread.creation;

public class ThreadWithThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        ThreadWithThread threadWithThread = new ThreadWithThread();
        threadWithThread.run();
    }
}
