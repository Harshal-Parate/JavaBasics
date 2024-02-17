package leetCode.Arrays;

import java.util.Arrays;

public class DifferenceBetweenSumAndSub {
    public static int differenceOfSum(int[] nums) {
        /*
            Input: nums = [1,15,6,3]
            Output: 9
            Explanation:
            The element sum of nums is 1 + 15 + 6 + 3 = 25.
            The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
            The absolute difference between the element sum and digit sum is |25 - 16| = 9.
         */


        String arr = Arrays.toString(nums);
        String ans="";
        for(int i=0; i<arr.length(); i++) {
            if(arr.charAt(i)!='[' && arr.charAt(i)!=' ' && arr.charAt(i)!=']' && arr.charAt(i)!=',') {
                ans = ans + arr.charAt(i);
            }
        }

        int digits = 0;
        for(int i=0; i<ans.length(); i++) {
            digits = digits+Integer.parseInt(String.valueOf(ans.charAt(i)));
        }
        System.out.println(digits);

        int sum = 0;
        for(int i=0; i< nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);

        return Math.abs(sum-digits);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,40};
        System.out.println(differenceOfSum(a));
    }
}
