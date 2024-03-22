package leetCode.Arrays;

public class MaxProductDifference {
    public static int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                max = Math.max(max, (nums[i]*nums[j]));
                min = Math.min(min, (nums[i]*nums[j]));
            }
        }
        return max-min;

        /*

        Alternate solution
                Arrays.sort(nums);
                int n = nums.length;
                int a = nums[n-1];
                int b = nums[n-2];
                int c = nums[0];
                int d = nums[1];
                int diff = (a*b)-(c*d);
                return diff;

         */


    }
}
