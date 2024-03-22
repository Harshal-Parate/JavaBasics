package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class appendingInBetween {

    /*
                String str= "accolitedigital";
                o/p= a5 c10 c15 o20 l25 i20 t15 e10 d5 i10 g15 i20 t25 a20 l15
     */


    public static String concatNumbers(String working) {
        List<Integer> numbers= helperFunction(working.length());

        StringBuilder sb = new StringBuilder();
        char [] arr = new char[working.length()];

        for(int i=0; i<working.length(); i++) {
            arr[i] = working.charAt(i);
            sb.append(arr[i]).append(numbers.get(i)).append(" ");
        }
        return sb.toString();
    }

    public static List<Integer> helperFunction (int length) {
        List<Integer> nos = new ArrayList<>(length);
        int forward = 0;
        for (int k = 0; k < 2; k++) {
            for (int i = 5; i <= 25; i = i + 5) {
                nos.add(forward++, i);
                if(forward>length)
                    break;
            }
            for (int i = 20; i > 5; i = i - 5) {
                nos.add(forward++, i);
                if(forward>length)
                    break;
            }
        }
        return nos;
    }

    public static void main(String[] args) {
        String word = "harshal";
        System.out.println(concatNumbers(word));

    }
}
