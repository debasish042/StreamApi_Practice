package MultiThreading;

public class DeadLock {
    public static void main(String[] args) {
        final String resource1= "pen";
        final String resource2= "paper";

        Thread t1= new Thread(()->{
            synchronized (resource1){
                System.out.println("Thread 1 locked resource1");
                try {Thread.sleep(100);} catch(Exception e){}
                synchronized (resource2){System.out.println("Thread 1 locked resource2");}
            }
        });
        Thread t2= new Thread(()->{
            synchronized (resource2){System.out.println("Thread 2 locked resource2");

            try {Thread.sleep(100);} catch(Exception e){}
            synchronized (resource1){
                System.out.println("Thread 2 locked resource1");
            }
            }
        });

        t1.start();
        t2.start();
    }
}
