package Collections.stack;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println(s.peek());
        s.pop();
        if(!s.isEmpty()) {
            System.out.println(s.peek());
        }
    }
}
