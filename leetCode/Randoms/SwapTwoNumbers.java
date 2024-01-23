package leetCode.Randoms;

public class SwapTwoNumbers {

    public static String swapTwoNumbers(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        return ("a = "+a+", b = "+b);
    }
    public static void main(String[] args) {
        String ans = swapTwoNumbers(0,100);
        System.out.println(ans);

    }
}
