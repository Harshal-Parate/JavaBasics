package leetCode;

public class StepsClimber {
    public static int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;
        for(int i=2; i<arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
