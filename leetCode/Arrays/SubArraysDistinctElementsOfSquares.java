package leetCode.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArraysDistinctElementsOfSquares {

    public static int sumCounts(List<Integer> nums) {

        /*
        List<Integer> l1 = new ArrayList<>();
        int c=0;

        for(int i=0; i<nums.size(); i++) {
            for(int j=i; j< nums.size(); j++) {
                for(int k=i; k<=j; k++) {
                    l1.add(nums.get(k));
                }
                Set<Integer> set = new HashSet<>(l1);
                c += Math.pow(set.size(), 2);
                l1.clear();
            }
        }
        return c;
         */

        int sum=0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.size(); i++) {
            for(int j=i; j<nums.size(); j++) {
                set.add(nums.get(j));
                sum += Math.pow(set.size(), 2);
                set.clear();
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        sumCounts(l);
    }
}
