package leetCode.Arrays;

public class FindFirstPalindromeStringInArray {
    public static String firstPalindrome(String[] words) {
//        String wordUnderArray="";
//        for (int i = 0; i < words.length; i++) {
//            wordUnderArray = words[i];
//            String pali = "";
//            for (int j = wordUnderArray.length()-1; j >= 0; j--) {
//                pali += wordUnderArray.charAt(j);
//            }
//            if (pali.equals(wordUnderArray)) {
//                return wordUnderArray;
//            }
//        }
//        return null;

        for(int i=0; i< words.length; i++) {
            if(words[i].equals(isPalindrome(words[i]))){
                return words[i];
            }
        }
        return "";
    }
    public static String isPalindrome(String word) {
        String pal="";
        for(int i=word.length()-1; i>=0; i--) {
            pal += word.charAt(i);
        }
        return pal;
    }

    public static void main(String[] args) {
        String[] arr = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(arr));
    }

}
