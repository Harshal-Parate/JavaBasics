package leetCode.Arrays;

public class FinalValueOfX {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("--X")) {
                --x;
            }
            else if(operations[i].equals("X--")) {
                x--;
            }
            else if(operations[i].equals("++X")) {
                ++x;
            }
            else {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] a = {"X++","X++"};
        System.out.println(finalValueAfterOperations(a));
    }
}
