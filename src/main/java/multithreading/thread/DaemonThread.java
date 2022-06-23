package multithreading.thread;

public class DaemonThread implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..." + i);
        }

    }

    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main.getName() + " is Daemon? " + main.isDaemon());
        DaemonThread daemonThread = new DaemonThread();
        Thread thread1 = new Thread(daemonThread);
        System.out.println(thread1.getName() + " is Daemon? " + thread1.isDaemon());
        thread1.setDaemon(true);
        System.out.println(thread1.getName() + " is Daemon? " + thread1.isDaemon());

        AnotherThread anotherThread = new AnotherThread();
        Thread t2 = new Thread(anotherThread);
        System.out.println(t2.getName() + " is Daemon? " + t2.isDaemon());
        t2.start();
        thread1.start();


        thread1.setDaemon(false);
    }
}

class AnotherThread implements Runnable {
    public void run() {
        System.out.println("Hi, I'm " + Thread.currentThread().getName());
    }
}
