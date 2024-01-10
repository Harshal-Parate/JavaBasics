package leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationOfArrays {
    public static int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
        }
        int count  =0;
        for (int i= nums.length; i<a.length; i++) {
            a[i] = nums[count];
            count++;
        }

        return a;
    }

    public static int[] getConcatArray(int[] input) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<2; i++) {
            for(int j=0; j<input.length; j++) {
                arr.add(input[j]);
            }
        }
        int[] ans = arr.stream().mapToInt(i -> i).toArray();
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = getConcatenation(a);
        int[]c = getConcatArray(a);

        for(int i: c) {
            System.out.println(i);
        }
    }
}
