package multithreading.thread.methods;

public class SleepMethod implements Runnable {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepMethod sleepMethod = new SleepMethod();
        Thread thread = new Thread(sleepMethod);
        Thread thread1 = new Thread(sleepMethod);
        thread.start();

        thread1.start();

        thread.interrupt();
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}


class SleepMethod2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000, 999999);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepMethod2 sleepMethod = new SleepMethod2();
        Thread thread = new Thread(sleepMethod);
        Thread thread1 = new Thread(sleepMethod);
        thread.start();

        thread1.start();

        thread.interrupt();
        try {
            Thread.sleep(-100, 9999);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000, 9999991);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000, -1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
