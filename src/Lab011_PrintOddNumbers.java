package src;

public class Lab011_PrintOddNumbers {

    public static void main(String[] args) {
        // print odd numbers from 1-50

        for(int i=1; i<=50; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}

