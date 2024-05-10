package InterviewQuestions;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {

        String a = "harshal";
        String b = "rlashha";
        boolean anagram;

        if (a.length() != b.length()) {
            anagram = false;
        } else {

            char[] A = a.toCharArray();
            char[] B = b.toCharArray();

            Arrays.sort(A);
            Arrays.sort(B);

            if (Arrays.equals(A, B)) {
                anagram = true;
            } else {
                anagram = false;
            }
        }
        System.out.println(anagram);


    }

}
