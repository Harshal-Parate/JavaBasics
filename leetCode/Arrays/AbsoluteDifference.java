package leetCode.Arrays;

public class AbsoluteDifference {
    public static int countKDifference(int[] nums, int k) {

        /*
        Input: nums = [1,2,2,1], k = 1
        Output: 4
        Explanation: The pairs with an absolute difference of 1 are:
        - [1,2,2,1]
        - [1,2,2,1]
        - [1,2,2,1]
        - [1,2,2,1]
         */

        int count=0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j< nums.length; j++) {
                if(Math.abs(nums[i]-nums[j])==k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        System.out.println(countKDifference(a,1));
    }
}
