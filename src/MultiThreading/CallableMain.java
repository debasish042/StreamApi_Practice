package MultiThreading;
import java.util.concurrent.*;
public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable <Integer> task= ()->{
            return 10+20 ;
        } ;

        Future <Integer> future = executor.submit(task);

        Integer result= future.get();
        System.out.println(result);
        executor.shutdown();

    }
}

/*
* Runnable r= ()->{
* System.out.println("Task is running");
*
* but there is a limitation we can't get result from runnable
*
* run() method return void
*
* }
*
* Solution --- we can use callable
*  --> callable returns result and throws exceptions
*
*
* What is future
* when we submit a callable task :
* Future<Integer> future = executor.submit(task);
*
* Future represents a result of asynchronous computation
*
* means
* --> Task running in background
* --> Result will be available later
*
* future.get() waits until task is finished
*
* future methods =
* --> future.get() -- returns result
* --> future.isDone -- check if task is finished
* --> future.cancel(true) -- cancels task
* */
