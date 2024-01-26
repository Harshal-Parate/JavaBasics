package MutliThreading.Basic;

public final class Thread1 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println( i +"  This is thread 1 by runnable interface" +Thread.currentThread());
        }
    }
}
