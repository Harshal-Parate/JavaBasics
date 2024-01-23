package Collections.List;

import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=0; i<10; i++) {
            v.add(i);
        }
        System.out.println(v);

        System.out.println(v.capacity());
    }


}
