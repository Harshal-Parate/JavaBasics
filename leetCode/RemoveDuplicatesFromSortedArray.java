package leetCode;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]!=nums[i-1]) {
                nums[k]=nums[i];
                k++;
            }
        }

        return k;
    }

    public static void removingDuplicates(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    arr[i]=0;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray a = new RemoveDuplicatesFromSortedArray();
        int[] a1 = {0,0,1,1,2,3,4,1,2};
        //System.out.println(a.removeDuplicates(a1));

        removingDuplicates(a1);
    }
}
