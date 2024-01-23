package Collections.Sett;

import java.util.HashSet;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<10; i++){
            s.add(i);
        }
        System.out.println(s);
        Set<Integer> s1 = new HashSet<>();
        for(int i=5; i<20; i++){
            s1.add(i);
        }
        System.out.println(s1);

        System.out.println(s.retainAll(s1));
        System.out.println(s.removeAll(s1));

        Set<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(9);
        s2.add(6);
        s2.add(8);
        System.out.println(s2); //does not maintain order of insertion



    }
}
