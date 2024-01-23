package Collections.useOfComaprators;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getMarks() - o2.getMarks(); //Ascending Order
    }
}
