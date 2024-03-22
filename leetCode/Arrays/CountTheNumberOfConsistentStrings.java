package leetCode.Arrays;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {

        int res=0;
        outerloop:
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(!allowed.contains(String.valueOf(words[i].charAt(j))))
                    continue outerloop;
            }
            res++;
        }

        return res;

    }



    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));

    }
}
