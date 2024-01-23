package leetCode.Randoms;

import java.util.Arrays;

public class removeElementInArray {

    public static int removeElement(int[] nums, int val) {
//        for(int i=0; i<nums.length; i++) {
//            if(nums[i]==val){
//                nums[i]= 0;
//            }
//        }
//
//        return 1;

        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }

    public static int removeDuplicates(int[] nums) {

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i-1]) {
                    nums[k]=nums[i];
                    k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
     int[] a = {0,0,1,1,1,2,2,3,3,4};
      //  System.out.println(removeElement(a,5));
        System.out.println(removeDuplicates(a));
    }

}
