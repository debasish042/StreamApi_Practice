package MultiThreading;
//creating a thread by implementing runnable
class MyTask implements Runnable {
    public void run() {
        System.out.println("This is runnable");
    }

        }

public class main {
    public main(String[] args) {
        Thread  t1= new Thread(new MyTask());
        t1.start();
    }
}


