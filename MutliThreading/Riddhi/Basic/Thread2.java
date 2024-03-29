package MutliThreading.Riddhi.Basic;

public class Thread2 extends Thread{

    public Thread2(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for(int i=5; i<=10; i++) {
            System.out.println(i+" This is thread 2 by extending Thread class"+ Thread.currentThread());
        }
    }
}
