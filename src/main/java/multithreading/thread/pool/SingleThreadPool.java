package multithreading.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            Runnable worker = new ThreadWorker("" + i);
            executorService.execute(worker);//calling execute method of ExecutorService
        }
        executorService.shutdown();
//        executorService.execute(thread);
//        executorService.execute(thread1);
//        executorService.execute(thread2);
//        executorService.execute(thread3);
//        executorService.execute(thread4);
//        executorService.execute(thread5);

    }
}