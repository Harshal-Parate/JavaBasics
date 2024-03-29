package MutliThreading.Riddhi.Basic;

public class ThreadTester {

    public static void main(String[] args) {

        System.out.println("Start of Main");

        Thread th1 = new Thread(new Thread1());
        th1.start();

        Thread th2  = new Thread2("Thread 2");
        // th2.setDaemon(true); --> Will not not as there are no any user threads running
        th2.start();

        System.out.println("End of Main");

        // Mostly we'll use Runnable interface as we can implements multiple interface
        // but only one class can be extended that's why we will use Runnable interface
    }
}
