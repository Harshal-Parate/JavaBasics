package src;

import java.util.Scanner;

public class Lab013_primeNumberChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int counter = 0;

        for(int i=1; i<=number; i++) {
            if(number%i==0) {
                counter++;
            }
        }
        if(counter>2) System.out.println("Not a prime");
        else System.out.println("Prime");
    }
}