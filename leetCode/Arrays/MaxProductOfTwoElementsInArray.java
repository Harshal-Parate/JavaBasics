package leetCode.Arrays;

import java.util.Arrays;

public class MaxProductOfTwoElementsInArray {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-2]-1)*(nums[nums.length-1]-1);
    }
}
