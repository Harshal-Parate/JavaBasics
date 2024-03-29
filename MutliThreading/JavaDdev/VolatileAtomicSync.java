package MutliThreading.JavaDdev;

import java.util.concurrent.atomic.AtomicInteger;

class shared {


    //Way 1
/*
    public int count;    //--> leads to race conditions
    public void inc() {
        count++;
    }
    public int getCount() {
        return count;
    }
*/

    //Way 2

    public AtomicInteger count = new AtomicInteger(0);  //--> atomic class

    public void inc() {
        count.incrementAndGet();  //---> this will take care that every time the another thread will get the updated value
    }

    public int getCount() {
        return count.get();
    }

    //Way 3
    /*

    public int count;

    public synchronized void inc() {  //--> synchronized keyword to avoid race, provides lock
        count++;
    }
    public int getCount() {
        return count;
    }

     */

}

public class VolatileAtomicSync {

    public static void main(String[] args) throws InterruptedException {
        shared shared = new shared();

        new Thread(()->{
            System.out.println("Thread 1 is started");

            for(int i=0; i<10000; i++) {
                shared.inc();
            }
            System.out.println("Thread 1 is completed");

        }).start();

        new Thread(()->{
            System.out.println("Thread 2 is started");

            for(int i=0; i<10000; i++) {
                shared.inc();
            }
            System.out.println("Thread 2 is completed");


        }).start();

        Thread.sleep(2000);
        System.out.println("Final Count--> "+shared.getCount());


    }
}
