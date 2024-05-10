package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 5, 4, 3, 2, 1};

        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            count++;
            if(arr[i]!=count) {
                System.out.println(count);
                break;
            }
        }

    }

}

