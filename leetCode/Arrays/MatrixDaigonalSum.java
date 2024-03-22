package leetCode.Arrays;

public class MatrixDaigonalSum {
    public static int  diagonalSum(int[][] mat) {

        /*
        int a=0;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = i; j <= i; j++) {
                a += mat[i][j];
            }

        }
        for (int i = mat[0].length-1; i >= 0; i--) {
            for (int j = i; j >= i; j--) {
                a += mat[i][j];
            }
        }
        if(mat[0].length%2!=0) {
            return a - (mat[mat.length / 2][mat[0].length / 2]);
        }
        else {
            return a;
        }
    }

         */

        int sum =0;
        int len = mat.length;

        for(int i=0;i<len;i++){
            sum+=mat[i][i];
            if(i!=len-i-1)
                sum+=mat[i][len-i-1];
        }

        return sum;


//        for(int i=0; i< mat.length; i++) {
//            System.out.println(mat[i][i]);
//        }

    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(diagonalSum(mat));
        diagonalSum(mat);
    }
}
