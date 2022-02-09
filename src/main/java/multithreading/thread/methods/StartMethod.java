package multithreading.thread.methods;

public class StartMethod implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is running....");
    }

    public static void main(String[] args) {
        StartMethod startMethod = new StartMethod();
        Thread thread = new Thread(startMethod);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " after calling start method on " + thread.getName());

        System.out.println("I am in " + Thread.currentThread().getName() + " thread.");

        // starting thread twice will give IllegalThreadState error
        thread.start();
        System.out.println("Won't be able to make to this point.");
    }
}
