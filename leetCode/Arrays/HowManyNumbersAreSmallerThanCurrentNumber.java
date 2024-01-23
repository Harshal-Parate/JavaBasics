package leetCode.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            int count =0;
            for(int j=0; j< nums.length; j++) {
                if(nums[i]>nums[j]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] arr1 = smallerNumbersThanCurrent(arr);
        for(int i=0; i< arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
