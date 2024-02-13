package leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {

        /*
            Input: nums = [1,2,3,4]
            Output: [2,4,4,4]
            Explanation: The first pair [1,2] means we have freq = 1 and val = 2
            So we generate the array [2].
            The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
            At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
        */
        List<Integer> finalRes = new ArrayList<>();
        int freq = 0;
        int val  = 1;
        for(int i=0; i<nums.length/2; i=i+1) {

            for(int j=0; j<nums[freq]; j++) {
                finalRes.add(nums[val]);
            }
            freq = freq+2;
            val  = val+2;
        }
        int[] arr = new int[finalRes.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = finalRes.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums  = {1,2,3,4};
        decompressRLElist(nums);
    }
}
