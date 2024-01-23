package leetCode.Randoms;

import java.util.Arrays;

public class IncrementInArray {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9};

        int[] a = plusOne(arr);
        for(int i : a) {
            System.out.println(i);
        }
    }

}
