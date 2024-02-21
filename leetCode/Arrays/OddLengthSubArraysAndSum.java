package leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class OddLengthSubArraysAndSum {
    public static int sumOddLengthSubarrays(int[] arr) {

        /*
        Input: arr = [1,4,2,5,3]
        Output: 58
        Explanation: The odd-length subarrays of arr and their sums are:
        [1] = 1
        [4] = 4
        [2] = 2
        [5] = 5
        [3] = 3
        [1,4,2] = 7
        [4,2,5] = 11
        [2,5,3] = 10
        [1,4,2,5,3] = 15
        If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
         */
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += 2) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(a));
    }
}
