package multithreading.thread.methods;

public class RunMethod implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is running....");
    }

    public static void main(String[] args) {
        RunMethod runMethod = new RunMethod();
        Thread thread = new Thread(runMethod);

        thread.run(); // main Thread is running....
        System.out.println(Thread.currentThread().getName() + " after calling run method first time on " + thread.getName());

        // will create a new call stack for this thread.
        thread.start(); // Thread-0 Thread is running....
        System.out.println(Thread.currentThread().getName() + " after calling start method on " + thread.getName());

        // We can call run method as many times as we want,
        // but it will execute in the callstack of main thread only.
        thread.run(); // main Thread is running....
        System.out.println("I am in " + Thread.currentThread().getName() + " thread.");

        thread.run(); // main Thread is running....
        System.out.println("Bye Bye!! " + Thread.currentThread().getName() + " thread.");
    }
}
