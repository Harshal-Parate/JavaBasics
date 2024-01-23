package Collections.Sett;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSett {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for(int i=0; i<20; i=i+2) {
            navigableSet.add(i);
        }
        System.out.println(navigableSet);

        System.out.println(navigableSet.floor(1));
        System.out.println(navigableSet.ceiling(5));
        System.out.println(navigableSet.higher(3));
        System.out.println(navigableSet.lower(3));
    }
}
