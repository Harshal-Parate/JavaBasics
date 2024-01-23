package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListt {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        List<Integer> list2  =new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        ListIterator<Integer> iterator = list2.listIterator();
        while(iterator.hasNext()) {
            System.out.println("List iterator code "+iterator.next());
        }

        list2.addAll(list);
        System.out.println(list2);


        ListIterator<Integer> iterator1 = list2.listIterator(list2.size());
        while(iterator1.hasPrevious()) {
            System.out.println("List iterator code "+iterator1.previous());
        }

        list2.addAll(list);
        System.out.println(list2);



        //ArrayList to Array conversion


        /* This will return the array at the end of the function if needed
           Do not need to think abut the size of the returning array [0]--> this will
           be taken care by the toArray() method
             list2.toArray(new Integer[0]);
        */

    }
}
