package InterviewQuestions;

public class FibSeries {

    public static void main(String[] args) {

        /*
        0 1 1 2 3 5 8 13..
         */

      int n1=0, n2=1, n3;
      int n=10;

      for(int i=2; i<n; i++) {
          n3 = n1+n2;
          n1=n2;
          n2=n3;
          System.out.println(n3);
      }




    }
}
