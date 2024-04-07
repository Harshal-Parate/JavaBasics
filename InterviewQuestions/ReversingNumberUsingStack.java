package InterviewQuestions;

import java.util.Stack;

public class ReversingNumberUsingStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        int a = 123;
        int actual = a;
        while(actual!=0) {
            int temp = actual%10;
            stack.add(temp);
            actual = actual/10;
        }
        for(int i=0; i<stack.size(); i++) {
            System.out.print(stack.get(i));
        }



    }

}
