package MultiThreading;
import java.util.concurrent.*;
public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(3);

        for(int i=1;i<=6;i++){
            int task = i;
            executor.submit(()->{
                System.out.println("Task"+task + "executed by" + Thread.currentThread().getName());
            });


        }
        executor.shutdown();
    }
}

/*
* A Thread pool is a group of pre created threads that can be reused to execute the task
*
* Instead of creating new thread every time tasks are assigned to the available threads in the pool
*
* why thread pool is needed
*  Creating a thread for every task is expensive
*
* Thread pools are created using Executor
*
*============================================================================
*Cached thread pool ---
*  Creates thread dynamically when needed
*
*  ExecutorService executor = Executors.newCachedThreadPool();
*
* it creates thread when needed
* reuses idle tasks
* good for short tasks
*
* ==============================================================================
*
*
*
*
*
*
* */
