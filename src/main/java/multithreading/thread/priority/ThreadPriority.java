package multithreading.thread.priority;

public class ThreadPriority implements Runnable{
    public void run() {
        Thread.currentThread().setPriority(9);
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " is: " + Thread.currentThread().getPriority());
        System.out.println("Thread is executing..");
    }

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Priority of thread " + mainThread.getName() + " is: " + mainThread.getPriority());
        ThreadPriority threadPriority = new ThreadPriority();
        Thread thread = new Thread(threadPriority, "My Thread");
        System.out.println("Priority of thread " + thread.getName() + " is: " + thread.getPriority());
        thread.start();
        System.out.println(mainThread.getName() + " is executing....");
    }
}
