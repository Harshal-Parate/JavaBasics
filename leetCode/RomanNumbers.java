package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public int romanToInt(String s) {

        Map<String, Integer> map= new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int sum=0;
        for(int i=0; i<s.length(); i++) {
            String current  = String.valueOf(s.charAt(i));

            if(i<s.length()-1 && map.get((s.charAt(i+1))) > (map.get(current))) {
                sum -= map.get(current);
            }
            else {
                sum += map.get(current);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanNumbers r = new RomanNumbers();
        System.out.println(r.romanToInt("M"));
    }
}
