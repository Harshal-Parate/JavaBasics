package leetCode;

import java.util.Arrays;

public class ReturnPrefix {
    public static String longestCommonPrefix(String[] strs) {

        int minLengthOfStringAvailable = Integer.MAX_VALUE;
        for(int i=0; i< strs.length; i++) {
            minLengthOfStringAvailable = Math.min(minLengthOfStringAvailable, strs[i].length());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<minLengthOfStringAvailable; i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int counter = 0;
        while (counter<s1.length()) {
            if(s1.charAt(counter)==s2.charAt(counter)) {
                counter++;
            }
            else {
                break;
            }
        }
        return s1.substring(0, counter);
    }

    public static void main(String[] args) {
        String[] a = {"Harsha","Harshaldcfvbn"};
        System.out.println(longestCommonPrefix(a));
        System.out.println(longestCommonPrefix2(a));
    }
}
