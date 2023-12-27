package src;

import java.util.Objects;
import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        //Grade Calculator
        Scanner Scan = new Scanner(System.in);
        float grade = Scan.nextFloat();

        if(grade>100) System.out.println("Enter marks between 0-100");

        if(grade<=100 && grade>=90) System.out.println("A");
        else if (grade<=89 && grade>=80) System.out.println("B");
        else if (grade<=79 && grade>=70) System.out.println("C");
        else if (grade<=69 && grade>=60) System.out.println("D");
        else if (grade<=59 && grade>=0) System.out.println("E");
        else System.out.println("F");
    }
}