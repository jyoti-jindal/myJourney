package multithreading.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Runnable worker = new ThreadWorker("" + i);
            executorService.execute(worker);//calling execute method of ExecutorService
        }
        executorService.shutdown();

        executorService.execute(new ThreadWorker("" + 1000));
    }
}