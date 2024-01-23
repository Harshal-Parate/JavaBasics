package MutliThreading.Basic;

import Classes.Threads.Thread1;

public class ThreadTester {

    public static void main(String[] args) {

        System.out.println("Start of Main");

        Thread th1 = new Thread1();
        th1.start();

//        Thread th2  = new Thread2();
//        th2.start();

        System.out.println("End of Main");

    }
}
