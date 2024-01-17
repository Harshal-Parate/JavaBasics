package Classes.Threads;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread using runnable interface");
    }


    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t = new Thread2();

        t.run();
        t1.start();
        //Thread.sleep(1000);
        t.run();
//   run priority will be given to runnable interface's run method over Threads's class start() method

        //t1.start(); ---> IllagalTreadStateException if thread is started twice

    }

}
