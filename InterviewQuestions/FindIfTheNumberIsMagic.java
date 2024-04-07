package InterviewQuestions;

public class FindIfTheNumberIsMagic {

    public static void main(String[] args) {

        int a = 1081;


        int actual = a;
        int sum = 0;
        while(actual!=0) {
            int temp = actual%10;
            sum = sum + temp;
            actual = actual/10;
        }
        System.out.println(sum);
    }
}
