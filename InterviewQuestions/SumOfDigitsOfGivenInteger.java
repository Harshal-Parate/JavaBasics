package InterviewQuestions;

public class SumOfDigitsOfGivenInteger {

    public static void main(String[] args) {


        int a = 111;
        int sum = 0;
        int z = a;

        while(z!=0) {
            int temp = z%10;
            sum = sum+temp;
            z = z/10;
        }
        System.out.println(sum);


    }
}
