package InterviewQuestions;

public class ArmStrongNumber {

    public static void main(String[] args) {


        int a = 371;

        int actualNo = a;
        int result = 0;

        while(actualNo!=0) {
            int temp = actualNo%10; //---------> select piche ka number
            result = result+ (int)Math.pow(temp,3);
            actualNo = actualNo/10; //----------> remove last digit
        }
        System.out.println(result);



    }
}
