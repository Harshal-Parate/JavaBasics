package leetCode.Arrays;

import java.util.*;

public class MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
        List<Integer> returnable = new ArrayList<>();
        int[] arr = new int[nums.length];

        for(int i=1; i< nums.length; i=i+2) {
            Arrays.sort(nums);
            returnable.add(nums[i]);
            returnable.add(nums[i-1]);

        }
        for(int i=0; i<returnable.size(); i++) {
            arr[i] = returnable.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,3};
        int[] arr1 = numberGame(arr);
        for(int i=0; i< arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

