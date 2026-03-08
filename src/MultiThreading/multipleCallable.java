package MultiThreading;

import java.util.concurrent.*;

public class multipleCallable {
    public static void main(String[] args) throws Exception {

        ExecutorService executor= Executors.newFixedThreadPool(3);

        Callable<Integer> task = ()-> 20;
        Callable<Integer> task1 = ()-> 30;
        Callable<Integer> task2 = ()-> 40;

        Future<Integer> future = executor.submit(task);
        Future<Integer> future1= executor.submit(task1);
        Future<Integer> future2= executor.submit(task2);

        System.out.println(future.get());
        System.out.println(future1.get());
        System.out.println(future2.get());

        executor.shutdown();

    }

}
