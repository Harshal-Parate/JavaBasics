package src;

public class Lab015_doubleTheArray {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]*2);
        }

        System.out.println();

        for(int i : a) {
            System.out.print(i*2);
        }
    }
}
