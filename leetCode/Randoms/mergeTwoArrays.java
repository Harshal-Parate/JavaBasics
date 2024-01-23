package leetCode.Randoms;

import java.util.Arrays;

public class mergeTwoArrays {
    public void merge(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] arrayWorking = new int[size];

        for(int i=0; i<nums1.length; i++) {
            arrayWorking[i] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++) {
            arrayWorking[nums1.length+i] = nums2[i];
        }
        Arrays.sort(arrayWorking);
        for(int i=0; i<arrayWorking.length; i++) {
            System.out.print(arrayWorking[i]);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0; i<n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        mergeTwoArrays m = new mergeTwoArrays();
        int[] a = {4,5,6,7,7,0,0,0};
        int[] b = {4,5,6};
       // m.merge(a,b);
        m.merge(a,5,b,3);
    }

}
