package src;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        // find max of two numbers using ternary operator
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

         System.out.println((a > b) ? a : b);

        //find max in between 3 numbers
        int max = a>b ? (a>c ? a:c) : (b<c ? c:b);
        System.out.println(max);

    }
}