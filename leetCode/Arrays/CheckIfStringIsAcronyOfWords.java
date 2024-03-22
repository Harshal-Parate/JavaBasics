package leetCode.Arrays;

import java.util.List;

public class CheckIfStringIsAcronyOfWords {

    /*
    Input: words = ["alice","bob","charlie"], s = "abc"
    Output: true
    Explanation: The first character in the words "alice", "bob", and "charlie" are
    'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
     */

    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.size(); i++) {
            String word = words.get(i);
            sb.append(word.charAt(0));
        }
        return s.equals(sb.toString());
    }
}
