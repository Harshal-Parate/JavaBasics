package leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        /*
            nums       index     target
            0            0        [0]
            1            1        [0,1]
            2            2        [0,1,2]
            3            2        [0,1,3,2]
            4            1        [0,4,1,3,2]
         */

        List<Integer> target =  new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        return target.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums,index);
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
