package MultiThreading;


class Counter {
    int count= 0;
    public synchronized void increment(){
        count++;
    }
}
public class Synchronization {
    public static void main(String[] args) throws InterruptedException {

       Counter c1= new Counter();

       Thread t1= new Thread(()->{
           for(int i=0;i<1000;i++)
               c1.increment();
       });

       Thread t2= new Thread(()->{
           for(int i=0;i<1000;i++)
               c1.increment();
       });

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.println(c1.count);


    }
}

/*
* Synchronization -- means allowing only one thread to access the resource at a time
* it prevents the race condition.
* Race condition occurs when two threads tries to access the resource means both the threads tries to modify the
* same variable simultaneously
* In java we use synchronized key word for that
*
* How synchronization works
*
* every java object has a intrinsic lock
* when a thread enters synchronized method it acquires the lock
* other method waits until the lock is released
* then it runs
*
* process of synchronization --
*
* Thread 1--> Enter the synchronization acquires the locks
* Thread 2 --> tries to enter --> waits
* Thread 1 --> finishes --> Release lock
* Thread 2 --> runs
*
* Thread Synchronization -- Synchronization controls multiple thread to access same resource to
* prevent data inconsistency
*
* it solves the problems of ---
* --> Race condition
* --> Data corruption
* --> Data inconsistency
* */
