package InterviewQuestions;

import java.util.Arrays;


public class Finding2ndHighestNumber {

    public static void main(String[] args) {

        int[] arr = {86,2,3,4,5,65,4,3,47,8,67,0};
        int max1 = 0;
        int max2 = 0;

        for(int i=0; i<arr.length; i++) {
            if(max1<arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2<arr[i]) {
                max2 = arr[i];
            }

        }

        System.out.println(max1);
        System.out.println(max2);


        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


        Arrays.stream(arr)
                .boxed()
                .sorted((a,b) -> b-a)
                .limit(3)
                .forEach(e -> System.out.print(e+" "));




    }
}
