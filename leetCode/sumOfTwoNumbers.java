package leetCode;

public class sumOfTwoNumbers {

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
//                    ans[0] = i;
//                    ans[1] = j;
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[]a = {3,3,2,4};
         int [] b = twoSum(a,6);
        for(int elements : b) {
            System.out.println(elements);
        }
    }
}
