package InterviewQuestions;

public class SwapTwoGivenStrings {

    public static void main(String[] args) {

        String a = "I'm String A";
        String b = "I'm String B";

        String temp = a;
        a=b;
        b=temp;

        System.out.println("String B Swapped--> "+b);
        System.out.println("String A Swapped--> "+a);

    }

}
