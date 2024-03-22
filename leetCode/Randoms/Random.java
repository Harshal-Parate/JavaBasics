package leetCode.Randoms;

public class Random {
    public static void problem() {

        /*
        a, 5, b, 10, c, 15, d, 20.....15,x,10,y,5,z
         */

/*
        int count = 0,C=0;
        for(int i=97; i<123; i++) {
            System.out.print((char)i+",");
            count++;
        }
        System.out.println();
        System.out.println(count);
        System.out.println();
        for(int i=1; i<=13; i++){
            System.out.print(i*5+" ");
            C++;
        }
        System.out.println();
        System.out.println(C);

        for(int i=13; i>=1; i--){
            System.out.print(i*5+" ");
            C++;
        }

 */
        //a=97 = 96+1;

        for(int i=1; i<=12; i++){
            System.out.println((char)(i+96) +" "+ (5*i)+",");
        }
        for(int j=13; j>=1; j--) {
            System.out.println((char)(j+96) +" "+ (5*j)+",");
        }




    }

    public static void main(String[] args) {
        problem();
    }
}
