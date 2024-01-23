package Collections.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListt {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        for(int i=0; i<10; i++) {
            l.add(i);
            System.out.print(i+" ");
        }

        l.size();
        l.addFirst(100);
        l.addLast(500);
        System.out.println(l);

    }
}
