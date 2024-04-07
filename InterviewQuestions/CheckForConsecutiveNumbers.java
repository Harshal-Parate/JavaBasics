package InterviewQuestions;

public class CheckForConsecutiveNumbers {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,7,8,9,10,11,12,4,56,363,44,463,6};

        int count =0;
        int max =0;

        for(int i=0; i<arr.length-1; i++) {

            if(arr[i+1]==arr[i]+1) {
                count++;
            }
            else {
                count=0;
            }
            max = Math.max(max, count+1);

        }
        System.out.println(max);

    }
}
