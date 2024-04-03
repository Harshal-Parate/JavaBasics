package InterviewQuestions;

public class SwappingTwoNumbers {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println(a+"  -  "+b);

        a = 3;
        b = 4;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a+"  -  "+b);




    }
}
