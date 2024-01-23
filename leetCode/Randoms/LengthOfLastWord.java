package leetCode.Randoms;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] workable = (s.trim()).split(" ");
        String lastWord = workable[workable.length-1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        LengthOfLastWord a = new LengthOfLastWord();
        String a1  = "Harshal Parate";
        System.out.println(a.lengthOfLastWord(a1));
    }
}
