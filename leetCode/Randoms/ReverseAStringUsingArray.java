package leetCode.Randoms;

public class ReverseAStringUsingArray {

    public static String reverseAStingUsingArray(String expression){

        char[] workable = expression.toCharArray();
        String ans = "";
        for(int i=0; i<workable.length; i++) {
            ans = ans+workable[workable.length-i-1];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseAStingUsingArray("Harshal"));
    }
}