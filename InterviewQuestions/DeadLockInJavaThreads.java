package InterviewQuestions;

class resource {

    private String resource1;
    private String resource2;

    public String getResource1() {
        return resource1;
    }

    public void setResource1(String resource1) {
        this.resource1 = resource1;
    }

    public String getResource2() {
        return resource2;
    }

    public void setResource2(String resource2) {
        this.resource2 = resource2;
    }
}

public class DeadLockInJavaThreads {

    public static void main(String[] args) {

        resource resource1 = new resource();
        resource resource2 = new resource();


        System.out.println("Main Start");

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Lock on R1 due to T1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (resource2) {
                    System.out.println("Lock on R1 due to T1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Lock on R1 due to T2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (resource1) {
                    System.out.println("Lock on R1 due to T2");
                }
            }
        });

        t1.start();
        t2.start();


        System.out.println("Main Exit");

    }


}
