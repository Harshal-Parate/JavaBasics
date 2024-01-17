package leetCode.Arrays;

public class RichestCoustomerWealth {
    public static int maximumWealth(int[][] accounts) {

        int max = 0;

        for(int i=0; i<accounts.length; i++) {
            int total=0;
            for(int j=0; j<accounts[i].length; j++) {
                 total = accounts[i][j] + total;
            }
            max = Math.max(total,max);
        }
        return max;
    }

    public static void array (int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j< arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        System.out.println(maximumWealth(arr));
     //   array(arr);
    }
}
