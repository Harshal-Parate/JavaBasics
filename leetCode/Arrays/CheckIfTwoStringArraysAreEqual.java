package leetCode.Arrays;

public class CheckIfTwoStringArraysAreEqual {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        /*
        Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        Output: true
        Explanation:
        word1 represents string "ab" + "c" -> "abc"
        word2 represents string "a" + "bc" -> "abc"
        The strings are the same, so return true.
         */

        String a="";
        String b="";
        for(int i=0; i<word1.length; i++) {
            a = a+word1[i];
        }
        for(int i=0; i<word2.length; i++) {
            b = b+word2[i];
        }
        return a.equals(b);
    }

    public static void main(String[] args) {

        String[] a = {"ab","c"};
        String[] b = {"a","bc"};
        System.out.println(arrayStringsAreEqual(a,b));
    }
}
