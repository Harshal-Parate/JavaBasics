package leetCode.Arrays;

import java.util.Arrays;

public class MaxSumWithKElements {

    public static int maximizeSum(int[] nums, int k) {


        /*
        Input: nums = [1,2,3,4,5], k = 3
        Output: 18
        Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
        For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
        For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
        For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
        So, we will return 18.
        It can be proven, that 18 is the maximum answer that we can achieve.
         */

        Arrays.sort(nums);
        int[] arr = new int[k];
        arr[0] = nums[nums.length - 1];
        int temp = nums[nums.length - 1];
        for (int i = 1; i < arr.length; i++) {
            temp++;
            arr[i] = temp;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(maximizeSum(a, 3));
    }
}
