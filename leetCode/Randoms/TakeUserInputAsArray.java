package leetCode.Randoms;

import java.util.Scanner;

public class TakeUserInputAsArray {

    public static int[] takingArrayAsAnInput(int sizeOfArray) {
        int[] arr = new int[sizeOfArray];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            int input = s.nextInt();
            arr[i] = input;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = takingArrayAsAnInput(10);
        for(int i : arr){
            System.out.print(i);
        }
    }
}