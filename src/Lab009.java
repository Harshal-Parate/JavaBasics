package src;

import java.util.Objects;

public class Lab009 {
    public static void main(String[] args) {
        // ADVANCED SWITCH LOOP
        int a=1;
        switch (a){
            case 1,2 -> System.out.println("Yes");
            default -> System.out.println("No");
            // no need to write break after avery condition
        }


        //Assign value using switch case
        //Can assign value in any primitive data type

        int b = 10;
        int value = switch (b) {
            case 1, 2, 3:
                yield 20;
            case 10:
                yield 100;

            default:
                throw new IllegalStateException("Unexpected value: " + b);
                //default will require throw
        };
        System.out.println(value);
    }
}
