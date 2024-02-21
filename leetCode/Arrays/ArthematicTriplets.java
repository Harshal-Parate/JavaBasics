package leetCode.Arrays;

public class ArthematicTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {


        /*
                    Input: nums = [0,1,4,6,7,10], diff = 3
                    Output: 2
                    Explanation:
                    (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
                    (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
         */

        int count=0;
        int ticker=0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j< nums.length; j++) {
                if(nums[j]-nums[i]==diff) {
                    count = j;
                    for(int k= count; k<nums.length; k++) {
                        if(nums[k]-nums[count]==diff) {
                            ticker++;
                        }
                    }
                }

            }
        }
        return ticker;
    }

    public static void main(String[] args) {
        int[] a = {0,1,4,6,7,10};
        System.out.println(arithmeticTriplets(a,3));
    }
}
