package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorService {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
        });

        executor.shutdown();
    }
}

/*
* Java provides executor service to manage thread efficiently
* Instead of creating threads manually we submit a task to a thread pool
*
* Executor service is a framework that manage a pool of threads and executes taks
* asynchronously
*
* What is thread Pool ?
*
* A thread pool is  a collection of reusable threads
*
* task1 --> thread1
* task2 --> thread2
* task3 --> thread3
* task4 --> thread1
*
* Threads are reused instead of created again and again
*
* benefits:
* Better performance
* Less Memory usage
* Efficient thread management
*
*
* Single thread executor
* only one thread executes task sequentially
*
* ExecutorService executor = Executors.newSingleThreadExecutor();
*
* */
