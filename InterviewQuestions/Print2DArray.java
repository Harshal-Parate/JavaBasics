package InterviewQuestions;

public class Print2DArray {

    static void printAllMatrix(int[][] arr) {
        int col = arr[0].length;
        int row = arr.length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static void printFirstCol(int[][] arr) {
        for(int i=0; i<arr[0].length; i++) {
            System.out.println(arr[i][0]);
        }

    }

    static void printSecondCol(int[][] arr) {
        for(int i=0; i<arr[0].length; i++) {
            System.out.println(arr[i][1]);
        }
    }

    static void print2Row(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[1][i]);
        }
    }

    static void printFirstRowAndLastCol(int[][] arr) {
        for(int i=0; i<arr[0].length-1; i++) {
            System.out.print(arr[0][i]+" ");
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i][3]+" ");
        }
    }

    static void printSnakeInMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row-1;
        int direction = 0;

        while(top<=bottom && left<=right) {
            if(direction==0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(direction==1) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(direction==2) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            } else if(direction==3) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            direction = (direction+1)%4;
        }



    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr1 = {{1, 2, 3, 4,5}, { 6, 7, 8,9,10}, { 11, 12,13,14,15}, { 16,17,18,19,20},{21,22,23,24,25}};

        printAllMatrix(arr);
        System.out.println("-------------------");
        printFirstCol(arr);
        System.out.println("-------------------");
        printSecondCol(arr);
        System.out.println("-------------------");
        print2Row(arr);
        System.out.println("-------------------");
        printFirstRowAndLastCol(arr);
        System.out.println("-------------------");
        printSnakeInMatrix(arr1);

    }
}
