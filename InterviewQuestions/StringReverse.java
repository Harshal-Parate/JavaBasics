package InterviewQuestions;

public class StringReverse {


    public static void main(String[] args) {
        String A = "Harshal";
        for(int i=A.length()-1; i>=0; i--) {
            System.out.print(A.charAt(i));
        }
    }

}
