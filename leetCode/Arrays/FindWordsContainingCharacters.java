package leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacters {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            String usable = words[i];
            for(int j=0; j<usable.length(); j++) {
                if (usable.charAt(j) == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"leet","code", "afe"};
        for(int i : findWordsContaining(arr,'e')) {
            System.out.println(i);
        }
    }
}
