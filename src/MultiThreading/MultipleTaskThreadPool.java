package MultiThreading;

import java.util.concurrent.*;

public class MultipleTaskThreadPool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1;i<=5;i++){

            int taskId = i;

            executor.submit(() -> {
                System.out.println("Task " + taskId +
                        " executed by " +
                        Thread.currentThread().getName());
            });
        }

        executor.shutdown();

        /*
        * executor.shutdown(); -- stops accepting new tasks and gracefully shuts down threads
        *
        * without shutdown application may keep running
        *
        * */
    }
}
