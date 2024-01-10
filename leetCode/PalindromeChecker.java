package leetCode;

public class PalindromeChecker {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
//        if((String.valueOf(x)).equals(sb.toString())){
//            return true;
//        }
//        return false;

        return (String.valueOf(x).equals(sb.toString()));
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        System.out.println(p.isPalindrome(121));
    }
}
