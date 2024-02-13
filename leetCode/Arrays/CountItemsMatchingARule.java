package leetCode.Arrays;

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        /*
        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
        ruleKey = "color", ruleValue = "silver"
        Output: 1
        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
         */
        int index = 0; //type
        int count = 0;

        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "Samsung"),
                Arrays.asList("laptop", "black", "Dell"),
                Arrays.asList("tablet", "white", "Apple"),
                Arrays.asList("phone", "black", "Apple")
        );
        System.out.println(countMatches(items,"color", "black"));

    }
}
