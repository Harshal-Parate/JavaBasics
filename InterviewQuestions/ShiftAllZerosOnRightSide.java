package InterviewQuestions;

import java.util.Arrays;

public class ShiftAllZerosOnRightSide {
    public static void main(String[] args) {

        int[] arr = {0,23,0,1,2,0,4,0,7,0,32,1};
        int j = arr.length-1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==0) {
                while(arr[j]==0 && j>i) {
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
