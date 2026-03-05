package MultiThreading;

public class ThreadSafety {
}

/*
* A class or code is thread safe if multiple threads can access it simultaneously without causing
* any data corruption and data inconsistency
*
* How to make code thread safe
*
* 1. using synchronized keyword
*
* class  counter extends thread {
*    int count= 0;
*    public synchronized void increment() {
*               count++;
*
* }
* }
*
* 2. using atomic classes
*
* 3. immutable objects --
*
*   --> immutable = object state can not change after creation
*
*     String name= "Debasish"
*
*   ---> String is immutable so automatically it is thread safe
*
* --> we can create immutable class by
*
*     final class User {
*         private final String name ;
*
*          public User(String name) {
*               this.name= name;
*               }
*
*           public String getName(){
*                return name ;
*          }
*
*      }
*
* 4. Using concurrent Collection
*
*   --> ConcurrentHashMap
*   -->CopyOnWriteArrayList
*   -->BlockingQueue
* */
