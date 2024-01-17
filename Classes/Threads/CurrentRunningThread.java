package Classes.Threads;

public class CurrentRunningThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        JoinMethodThreads t1 = new JoinMethodThreads();
        Thread1 t2 = new Thread1();
        CurrentRunningThread t3 = new CurrentRunningThread();

        t1.start();
        t3.start();
        t2.start();


    }
}
