package MutliThreading.JavaDdev;

public class DemonThread {

    public static void main(String[] args) {

        System.out.println("main started");

        Runnable objRunnable = () -> {
            System.out.println("Thread is running");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread is completed");
        };


        Thread objThread = new Thread(objRunnable, "Thread 1");
        objThread.setDaemon(true);
        objThread.start();

        System.out.println("Main exit");

    }
}
