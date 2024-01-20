package Classes.Threads;

import java.io.IOException;

public class execCommand {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notes");

        Runtime.getRuntime().exec("shutdown -s -t 0");  // Shutdown

        Runtime.getRuntime().exec("shutdown -r -t 0");  // Restart

//        System.out.println("Total Memory: "+Runtime.totalMemory());
//        System.out.println("Free Memory: "+Runtime.freeMemory());
    }
}
