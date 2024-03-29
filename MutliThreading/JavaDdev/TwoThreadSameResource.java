package MutliThreading.JavaDdev;

public class TwoThreadSameResource {

public static Object sharedObject = new Object();    //--> global and can be accessed by any thread if needed

    public static void main(String[] args) {



        Runnable objRunnable1 = () -> {

            System.out.println("Thread 1 is started");

            int runnable1 = 1;      //----> local and is stored in thread stack
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(sharedObject.hashCode());
            System.out.println("Thread 1 is finished");
        };

        Runnable objRunnable2 = () -> {

            System.out.println("Thread 2 is started");

            int runnable2 = 2;      //----> local and is stored in thread stack
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(sharedObject.hashCode());
            System.out.println("Thread 2 is finished");

        };

        Thread objThread1 = new Thread(objRunnable1, "Thread 1");
        objThread1.start();

        Thread objThread2 = new Thread(objRunnable2, "Thread ");
        objThread2.start();


    }


}
