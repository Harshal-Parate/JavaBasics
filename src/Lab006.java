package src;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        if(a==0 || b==0 || c==0) System.out.println("Enter valid number between 0-N");

        else if (a == b && b == c && a == c) System.out.println("Equilateral Triangle");
        else if ((a == b) || (b == c) || (a == c)) System.out.println("Iso Triangle");
        else System.out.println("Scalan Triangle");
    }
}