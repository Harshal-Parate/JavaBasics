package leetCode.Arrays;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] restoringValues = new char[indices.length];
        for(int i=0; i< indices.length; i++) {
            restoringValues[indices[i]] = s.charAt(i);
        }
        String a = "";
        for(int i=0; i<restoringValues.length; i++) {
            a=a+restoringValues[i];
        }
        return a;
    }

    /*
    StringBuilder ans= new StringBuilder(str);
        for(int i=0;i<arr.length;i++){
            ans.setCharAt(arr[i],str.charAt(i));
        }
        return ans.toString();
     */

    public static void main(String[] args) {
        int[] a= {4,3,2,1,0};
        String b = "Harsh";
        System.out.println(restoreString(b,a));
    }
}
