package src;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        // find if the enter char is vowel or not

        Scanner s = new Scanner(System.in);
        char a = s.next().toLowerCase().charAt(0);
        String vowels = "aeiou";

        for(int i=0; i<vowels.length(); i++){
            if(a==vowels.charAt(i)){
                System.out.println("Given char is vowel");
                break;
            }
        }
    }
}