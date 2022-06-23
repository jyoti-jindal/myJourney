package multithreading.thread;

public class ShutDownHook {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook is running...");
            }
        });

        System.out.println("Sleeping..");
        Thread.sleep(100000);
        System.out.println("Woke up..");
        System.out.println("Application Terminating ...");

    }


}

class ThreadChild extends Thread {

    public void run() {

        System.out.println("In clean up code");
        System.out.println("In shutdown hook");
    }
}