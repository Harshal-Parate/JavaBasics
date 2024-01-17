package leetCode.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0; i<nums.size(); i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if((nums.get(i)+nums.get(j))<target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>();
        int[] arr = {-1,1,2,3,1};
        for (int i = 0; i < arr.length; i++) {
            i1.add(arr[i]);
        }
        System.out.println(i1.size());


        System.out.println(countPairs(i1, 2));
    }
}
