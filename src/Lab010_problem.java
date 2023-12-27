package src;

import java.util.Scanner;

public class Lab010_problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        float y = s.nextFloat();
        float z = s.nextFloat();

        double ans = Math.sqrt((x*x)+(y*y)-(Math.abs(z)));
    }
}