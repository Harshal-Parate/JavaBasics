package MutliThreading.Riddhi.Advanced;

public class ThreadTester {

    /*    public static void main(String[] args) {
            Thread th1 = new Thread(new Thread1());
            th1.start();
            }
    */

    /*
            using Lambda for creating the threads directly
    */

    public static void main(String[] args) {
        Thread th1 = new Thread( () ->
        {
            for(int i=1; i<=10; i++) {
                System.out.println(i);
            }
        }, "thread 2");

        th1.start();

        System.out.println(th1.getName());
    }
}
