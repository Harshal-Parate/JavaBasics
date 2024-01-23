package leetCode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSumOf1DArray {
    public static int[] runningSum(int[] nums) {
//        int[] arr = new int[nums.length];
//
//        System.out.println(Arrays.toString(nums));
//
//        arr[0] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            int fact = nums[i - 1];
//            fact = fact + nums[i];
//            arr[i] = fact;
//        }
//        System.out.println(Arrays.toString(arr));
//        return arr;

        for(int i=1; i< nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] arr1 = runningSum(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
