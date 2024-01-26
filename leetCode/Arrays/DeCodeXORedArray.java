package leetCode.Arrays;

public class DeCodeXORedArray {
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for(int i=1; i<arr.length; i++) {
            arr[i] = encoded[i-1] ^ arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = decode(arr,1);
        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
