package leetCode.Arrays;

import java.util.ArrayList;

public class BuildPermutationArray {
    public static int[] buildArray(int[] nums) {
        int[] workable  = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            workable[i] =   nums[nums[i]];
        }
        return workable;
    }

    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        int[] b = buildArray(a);
        for(int i : b) {
            System.out.print(i);
        }
    }
}
