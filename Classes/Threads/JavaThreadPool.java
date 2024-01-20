package Classes.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThreadPool extends Thread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable worker = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable thread");
            }
        };

        executorService.execute(worker);
    }
}
