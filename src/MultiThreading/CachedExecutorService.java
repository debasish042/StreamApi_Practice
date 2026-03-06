package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(()->{
            System.out.println("Task executed by " + Thread.currentThread().getName());
        });
        executor.shutdown();
    }
}

/*
* it creates thread as needed
*
* Good for short tasks
* */
