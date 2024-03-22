package leetCode.Arrays;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int current =0;
        int maxAtt = 0;
        for(int i=0; i<gain.length; i++) {
            current = current+gain[i];
            maxAtt = Math.max(maxAtt,current);
        }
        return maxAtt;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
