package leetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNoOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxFromArray = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            if(maxFromArray<candies[i]) {
                maxFromArray = candies[i];
            }
        }
       List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            if((candies[i]+extraCandies)>=maxFromArray) {
                list.add(true);
            }
            else list.add(false);
        }

    return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));

    }
}
