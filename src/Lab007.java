package src;

import java.util.Scanner;

public class Lab007 {
    public static void main(String[] args) {

        //Switch Case

        Scanner s = new Scanner((System.in));
        int date  = s.nextInt();

        switch (date){
            case 1:
                System.out.println("M");
                break;
            case 2:
                System.out.println("T");
                break;
            default:
                System.out.println("No conditions");
                // break is optional here
        }
        System.out.println("out of code");
    }
}
