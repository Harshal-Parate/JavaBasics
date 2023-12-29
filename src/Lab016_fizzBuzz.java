package src;

import java.util.Arrays;

public class Lab016_fizzBuzz {
    public static void main(String[] args) {

        // fizz buzz for an array

        String[] a = new String[101];
        for (int i = 1; i < a.length; i++) {
            a[i] = String.valueOf(i);
            int userArray = Integer.parseInt(a[i]);
            if (userArray % 5 == 0 && userArray % 3 == 0) {
                a[i] = "Fizzbuzz";
            } else if (userArray % 3 == 0) {
                a[i] = "Fizz";
            } else if (userArray % 5 == 0) {
                a[i] = "Buzz";
            }
            System.out.println(a[i]);
        }
    }
}