package MutliThreading.JavaDdev;


class sharedResources{

    //public volatile boolean flag = false;    //----> Volatile keyword is used
    public boolean flag = false;

    /*
    can also be handled using the synchronised key word at method level
     */

//    public boolean isFlag() {
//        return flag;
//    }
//
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }

}

public class VisibilityIssuesInThreads {

    /*
    VOLATILE AND SYNCHRONISED KEY-WORDS
     */

    public static void main(String[] args) {

        sharedResources sharedResources = new sharedResources();

        new Thread(()->{
            System.out.println("Thread 1 started");

            try {

                System.out.println("Thread 1 logic started");
                Thread.sleep(2000);
                System.out.println("Thread 1 logic is completed");
                sharedResources.setFlag(true);                      //-----> updated the value to true
                System.out.println("Flag is set by Thread 1");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 is finish");

        }).start();

        new Thread(()->{

            System.out.println("Thread 2 is started");

            while (sharedResources.isFlag()==false) { //----> this will keep running util the loop gets the value as true
                // run until flag is true
            }
            System.out.println("Thread 2 is finish");

        }).start();





    }


}
