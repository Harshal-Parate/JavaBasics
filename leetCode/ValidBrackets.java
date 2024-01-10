package leetCode;

import java.util.*;

public class ValidBrackets {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (currentChar == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (currentChar == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String a = "(){}[]";
        System.out.println(isValid(a));
    }
}
