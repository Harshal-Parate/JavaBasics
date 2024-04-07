package InterviewQuestions;

import java.util.Arrays;

public class PrintSecondLargestInGivenArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,0};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
