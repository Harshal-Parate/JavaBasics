package Collections.Maps;

import java.util.*;

public class HashMapp {
    public static void main(String[] args) {

        Map<String, Integer> map  = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);

        int a = map.get("D");
        System.out.println(a);

        Set<String> key = new HashSet<>(map.keySet());
        Set<Integer> values  = new HashSet<>(map.values());

        System.out.println(key);
        System.out.println(values);


    }
}
