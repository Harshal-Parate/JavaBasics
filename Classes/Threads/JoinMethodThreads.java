package Classes.Threads;

public class JoinMethodThreads extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            System.out.println("Im Thread to print for loop in iteration of --> "+i);
        }
    }


    public static void main(String[] args) {



        JoinMethodThreads m1 = new JoinMethodThreads();
        JoinMethodThreads m2 = new JoinMethodThreads();
        Thread1 t3 = new Thread1();

        m1.start();

        //Joins method pause the excution of the particular thread of given amount of time, then restart it
        try {
            m1.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();


        System.out.println("----------------------------");
        System.out.println("----------------------------");

        System.out.println(m1.getName());
        System.out.println(t3.getName());

        m1.setName("joins wala thread");
        t3.setName("Thread class wala thread");
        System.out.println(m1.getName());
        System.out.println(t3.getName());


    }
}
