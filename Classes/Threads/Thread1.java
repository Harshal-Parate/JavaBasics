package Classes.Threads;

public class Thread1 extends Thread {  //Thread using extending "Thread class"

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("*");
        }
        //System.out.println("thread is running using Thread class");
    }

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread1 t1 = new Thread1();
        t.start();
        t1.run();
    }
}
