package MutliThreading.JavaDdev;


// extending the Thread class and overriding the "run" method
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

public class Threads {
    public static void main(String[] args) {

        System.out.println("Hello World");


        // Creating a thread
        //Way 1
        MyThread objThread = new MyThread();
        objThread.start();      //---> starting the thread


        // Way 2
        Thread objThread2 = new Thread(() -> {               //----> using lambda expression to create the Thread
            System.out.println("Thread 2 is running");
        });
        objThread2.start();             //---> starting the thread


        //Way 3
        // Now a days a use "Runnable interface to create a Thread"
        Runnable objRunnable = () -> {   //----> runnable is functional interface as it only contains only one abstract method

            System.out.println("Thread 3 is running");
            System.out.println(Thread.currentThread().getName()+"--->Name of the thread");
            System.out.println(Thread.currentThread().getState()+"---->State of the thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 3 is completed");
        };

        Thread objThread3 = new Thread(objRunnable, "Thread 3");

        objThread3.setDaemon(true);  //--> main thread will not wait for this particular thread to get finish, this thread can run in background

        objThread3.start();

        System.out.println("Main Thread exit");




    }


}
