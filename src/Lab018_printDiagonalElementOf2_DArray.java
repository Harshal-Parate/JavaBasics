package src;

import com.sun.security.jgss.GSSUtil;

public class Lab018_printDiagonalElementOf2_DArray {

    public static void printDiagonalElementsOfAn2DArray(int[][] arr) {
        // [][]--> 1st one is row and another one is column
        //1,5,9

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++) {
             if(i==j){
                 System.out.print(arr[i][j]);
             }
            }
        }
        System.out.println("-----");

        //2,3,6
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++) {
                if(i<j){
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.println("-----");

        //4,7,8
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++) {
                if(i>j){
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.println("-----");

        //3,5,7
        int counter = arr.length-1;
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i][counter]);
            counter--;
        }
        System.out.println("-----");

        // column wise reverse
         for(int i=0; i< arr.length; i++) {
             for(int j=arr.length-1; j>=0; j--) {
                 System.out.println(arr[i][j]);
             }
             System.out.println();
         }

         //row wise reverse
        for(int i= arr.length-1; i>=0; i--) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // traverse like a snake till the middle element
        //1,2,3,6,9,8,7,4,5

        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[0][j]);
        }
        System.out.println();
        for(int i=1; i<arr.length; i++) {
            int j = arr.length-1;
            System.out.print(arr[i][j]);
        }
        System.out.println();
        for(int j=arr.length-2; j>=0; j--) {
            int i=arr.length-1;
            System.out.print(arr[i][j]);
        }
        System.out.println();
        for(int j=0; j< arr.length-1; j++) {
            int i = arr.length-2;
            System.out.print(arr[i][j]);
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};   //3*3
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};   //4*4
        printDiagonalElementsOfAn2DArray(arr1);
    }
}
