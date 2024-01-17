package leetCode.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int x = 0;
        int y = 0;
        int setter = 1;
        int[] arr = new int[nums.length];

        for (int i = 0; i < ((nums.length) / 2); i++) {
            arr[i + x] = nums[i];
            x++;
        }
        for (int j = ((nums.length) / 2); j < nums.length; j++) {
            arr[setter + y] = nums[j];
            setter++;
            y++;
        }
        return arr;
    }

    public static int[] shuffle1(int[] nums, int n) {
        int[] arr = new int[n * 2];
        int i = n;
        int j = 0;
        for (int k = 0; k < 2*n; k++) {
            arr[k] = nums[j];
            k++;
            arr[k] = nums[i];
            i++;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle1(arr, n);
        for (int i : result) {
            System.out.println(i);
        }
    }
}