package leetCode.Arrays;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LargestLocalValueInMatrix {
    /*
    public static void largestLocal() {

        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

    }

    public static void test() {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};

        List<Integer> values = new ArrayList<>();

        int biggerMatrixLength = grid.length;
        int biggerMatrixWidth = grid[0].length;
        int max1 = 0;
        for (int i = 0; i < biggerMatrixLength / 2; i++) {

            for (int j = 0; j < biggerMatrixWidth / 2; j++) {
                max1 = Math.max(grid[j][i], max1);
            }

        }
        values.add(max1);

        int max2 = 0;
        for (int i = biggerMatrixLength / 2; i < biggerMatrixLength; i++) {

            for (int j = 0; j < biggerMatrixWidth / 2; j++) {
                System.out.print(grid[j][i]);
                max2 = Math.max(grid[j][i], max2);
            }

        }
        values.add(max2);
        int max3 = 0;
        for (int i = 0; i < biggerMatrixLength / 2; i++) {

            for (int j = biggerMatrixWidth / 2; j < biggerMatrixWidth; j++) {
                System.out.print(grid[j][i]);
                max3 = Math.max(grid[j][i], max3);
            }

        }
        values.add(max3);
        int max4 = 0;
        for (int i = biggerMatrixLength / 2; i < biggerMatrixLength; i++) {

            for (int j = biggerMatrixWidth / 2; j < biggerMatrixWidth; j++) {
                System.out.print(grid[j][i]);
                max4 = Math.max(grid[j][i], max4);
            }

        }
        values.add(max4);



    }

     */

    /*
    public static void main(String[] args) {

        largestLocal();
        System.out.println("-------");
        test();
    }

     */

    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] matrix = new int[m-2][n-2];
        for(int i=0; i<m-2; i++) {
            for(int j=0; j<n-2; j++) {
                matrix[i][j] = getValue(grid, i, j);
            }
        }
        return matrix;
    }

    // Helper Function
    public static int getValue(int[][] grid, int x, int y) {
        int max=0;
        for(int i=x; i<x+3; i++) {
            for(int j=y; j<y+3; j++) {
                max = Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}



















