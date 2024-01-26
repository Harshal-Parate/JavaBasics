package leetCode.Arrays;

public class LeftAndRightSumDifferences {
    public static int[] leftRightDifference(int[] nums) {

        int[] arr = new int[nums.length];

        for(int i=0; i< nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for(int j=0; j<i; j++) {
                leftSum = leftSum + nums[j];
            }

            for (int k=i+1; k< nums.length; k++) {
                rightSum = rightSum + nums[k];
            }
            arr[i] = Math.abs(rightSum-leftSum);

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,8,3};
        int[] arr1 = leftRightDifference(arr);
        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
