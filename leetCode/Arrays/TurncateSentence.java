package leetCode.Arrays;

public class TurncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++) {
            sb.append(arr[i]+" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String a = "Hello how are you";
        System.out.println(truncateSentence(a,2));
    }
}
