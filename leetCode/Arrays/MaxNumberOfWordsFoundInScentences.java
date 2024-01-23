package leetCode.Arrays;

public class MaxNumberOfWordsFoundInScentences {

    public static int mostWordsFound1(String[] sentences) {

        int max = Integer.MIN_VALUE;
        String[] iterable; int maxi = 0;
        for(int i=0; i<sentences.length; i++) {
            String usable = sentences[i];
            iterable = usable.split(" ");
            for(int j=0; j<iterable.length; j++) {
                String secondUsable = iterable[j];
                int lengthOfWord = secondUsable.length();
                maxi = Math.max(lengthOfWord, maxi);
            }
        }
        return maxi;
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        String[] iterable;
        int maxi = 0;
        for (int i = 0; i < sentences.length; i++) {
            String usable = sentences[i];
            iterable = usable.split(" ");
            int length = iterable.length;
            maxi = Math.max(length, maxi);
        }
        return maxi;
    }

    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
        System.out.println("senntense ke ander ka sab se bada work ki length");
        System.out.println(mostWordsFound1(arr));
    }
}
