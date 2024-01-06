package src;

public class Lab018_maxInArray {
    public static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-11,-2,-3,-4,-5,-5,-5,-5,-5,-10,0};
        System.out.println(maxInArray(arr));
    }
}
