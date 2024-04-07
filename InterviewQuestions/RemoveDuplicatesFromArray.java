package InterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,34,5,67,0,1,2};

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1;j< arr.length; j++) {
                if(arr[i]==arr[j]) {
                    arr[j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----");

        int j= arr.length-1;
        for(int i=0; i< arr.length; i++) {
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

        for(int i=0; i< arr.length; i++) {
            if(arr[i]==0) {
                break;
            }
            System.out.print(arr[i]+",");
        }





    }
}
