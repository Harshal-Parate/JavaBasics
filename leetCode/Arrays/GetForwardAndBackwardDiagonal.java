package leetCode.Arrays;

public class GetForwardAndBackwardDiagonal {
    public static void diagonal() {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        String a="";
        String b ="";
        for(int i=0; i< mat.length; i++) {
            a += mat[i][i];
            b += mat[i][mat.length-i-1];
        }
        System.out.print(a);
        System.out.println();
        System.out.print(b);
    }

    public static void main(String[] args) {
        diagonal();
    }
}
