package leetCode.Arrays;

import java.util.Arrays;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] arr = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int end = image[i].length - 1;
            int start = 0;
            for (int j = 0; j < image[i].length; j++) {
                while (start < end) {
                    int temp = image[i][start];
                    image[i][start] = image[i][end];
                    image[i][end] = temp;
                    start++;
                    end--;
                }
                arr[i][j] = image[i][j] ^ 1;
            }
        }
        return arr;

    }



    /*

    123
    456
    789

     */


//    public static void flip() {
//        int[] arr = {1,1,1};
//        int[] a = new int[arr.length];
//
//        for(int i=0; i< arr.length; i++) {
//
//                a[i] = arr[i]^1;
//
//
//        }
//
//        System.out.println(Arrays.toString(a));
//    }
    //flip an 2D array

    public static void _2DFlip() {

        int[][] a = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

        for (int i = 0; i < a.length; i++) {
            int end = a[i].length - 1;
            int start = 0;
            for (int j = 0; j < a[i].length; j++) {
                while (start < end) {
                    int temp = a[i][start];
                    a[i][start] = a[i][end];
                    a[i][end] = temp;
                    start++;
                    end--;
                }

                System.out.print(a[i][j] ^ 1);
            }
            System.out.println();
        }


    }


    // filping 1D array
    public static void flipping() {
        int[] arr = {1, 2, 3, 4, 5};


        int start=0;
        int end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));


//
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//
//
//        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        //flip();
        flipping();
        _2DFlip();


        //System.out.println(0^0);
    }



}
