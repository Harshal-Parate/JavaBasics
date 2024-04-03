package InterviewQuestions;

public class ReverseANumber {

    public static void main(String[] args) {

        int n = 234;
        int actual = n;
        int ne = 0;
        while(actual!=0) {

            int temp = actual%10;
            ne = ne*10 + temp;
            actual = actual/10;


        }
        System.out.println(ne);





    }
}
