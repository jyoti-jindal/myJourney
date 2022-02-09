package multithreading.thread.creation;

public class ThreadWithRunnable implements Runnable{
    public void run() {

        System.out.println(Thread.currentThread().getName() + ": Thread is executing...."); // Thread is executing....
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadWithRunnable threadWithRunnable = new ThreadWithRunnable();

        Thread thread = new Thread(threadWithRunnable);
        thread.start();
        System.out.println(thread.getName() + ": " +thread.getState()); //Runnable

        thread.join();

        Thread thread1 = new Thread(threadWithRunnable, "My First Named Thread");
        thread1.start();
        System.out.println(thread1.getName() + ": " + thread1.getState()); // My Thread: RUNNABLE

        thread1.join();

        Thread thread2 = new Thread("My Second Named Thread");
        thread2.run();
        System.out.println(thread2.getName() + ": " + thread2.getState()); // My Thread: RUNNABLE

        thread2.start();
        System.out.println(thread2.getName() + ": " + thread2.getState()); // My Thread: RUNNABLE

        Thread thread3 = new Thread();
        thread3.start();
        System.out.println(thread3.getName() + ": " + thread3.getState()); // My Thread: RUNNABLE
    }
}
