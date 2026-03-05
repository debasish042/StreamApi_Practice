package MultiThreading;
//by extending thread
 class myThread  extends Thread{
         public void run(){
             System.out.println("Thread is running");
         }

         public class creatingAthread {
             public static void main(String[] args) {
                 myThread thread= new myThread();
                 thread.start();
             }

         }
}
