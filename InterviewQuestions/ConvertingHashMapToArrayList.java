package InterviewQuestions;

import java.util.*;

public class ConvertingHashMapToArrayList {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        Set<Integer> keys = new HashSet<>(map.keySet());
        List<String> values = new ArrayList<>(map.values());




    }
}
