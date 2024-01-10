package leetCode.Arrays;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]==nums[j] && i<j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        int b = numIdenticalPairs(a);
        System.out.print(b);
    }
}
