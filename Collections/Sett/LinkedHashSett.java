package Collections.Sett;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSett {
    public static void main(String[] args) {
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(0);
        s2.add(9);
        s2.add(6);
        s2.add(8);
        System.out.println(s2);

        //maintain order of insertion
        // uses doubled linked list internally
    }
}
