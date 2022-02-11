package multithreading.thread.methods;

public class JoinMethod implements Runnable {
    static Thread threadToInterrupt;

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread is running....");
        }
        if (threadToInterrupt != null) threadToInterrupt.interrupt(); //main thread is interrupted.
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod joinMethod = new JoinMethod();
        Thread thread = new Thread(joinMethod);
        thread.start();
        thread.join(); // main is waiting for thread-0 to complete its task
        System.out.println("Bye Bye!! - " + thread.getName());

        Thread thread1 = new Thread(joinMethod);
        threadToInterrupt = Thread.currentThread();
        thread1.start();
        thread1.join(); // main is waiting for thread-2 to complete its task
        System.out.println("Can't reach here!! - " + Thread.currentThread().getName());
    }
}

class JoinMethod2 implements Runnable {
    static Thread threadToInterrupt;

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread is running....");
        }
        if (threadToInterrupt != null) threadToInterrupt.interrupt(); //main thread is interrupted.
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod2 joinMethod = new JoinMethod2();
        Thread thread = new Thread(joinMethod);
        thread.start();
        thread.join(999999999); // main is waiting for 100 thread-0 to complete its task
        System.out.println("Bye Bye!! - " + thread.getName());

        Thread t1 = new Thread(joinMethod);
        t1.start();
        try {
            t1.join(-10);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(joinMethod);
        threadToInterrupt = Thread.currentThread();
        thread1.start();
        thread1.join(999999999); // main is waiting for thread-1 to complete its task
        System.out.println("Can't reach here!! - " + Thread.currentThread().getName());
    }
}

class JoinMethod3 implements Runnable {
    static Thread threadToInterrupt;

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread is running....");
        }
        if (threadToInterrupt != null) threadToInterrupt.interrupt(); //main thread is interrupted.
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod3 joinMethod = new JoinMethod3();
        Thread thread = new Thread(joinMethod);
        thread.start();
        thread.join(999999999, 999999); // main is waiting for 100 thread-0 to complete its task
        System.out.println("Bye Bye!! - " + thread.getName());

        Thread t1 = new Thread(joinMethod);
        t1.start();
        try {
            t1.join(999999999, 9999999);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(joinMethod);
        t2.start();
        try {
            t2.join(999999999, -1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        Thread t3 = new Thread(joinMethod);
        t3.start();
        try {
            t3.join(-10, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        Thread thread1 = new Thread(joinMethod);
        threadToInterrupt = Thread.currentThread();
        thread1.start();
        thread1.join(999999999, 999999); // main is waiting for thread-1 to complete its task
        System.out.println("Can't reach here!! - " + Thread.currentThread().getName());
    }
}