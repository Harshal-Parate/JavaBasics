package Collections.useOfComaprators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerMain {
    public static void main(String[] args) {
        Students s1 = new Students("Maths", "Harshal", 90);
        Students s2 = new Students("English", "Harshal", 95);
        Students s3 = new Students("Science", "Harshal", 100);
        Students s4 = new Students("Hindi", "Harshal", 50);
        Students s5 = new Students("Marathi", "Harshal", 60);

        List<Students> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        System.out.println(list1);
        Collections.sort(list1);

        System.out.println(list1);

//        Students s = new Students();
//        s.takingInput();
//        s.giveInfo();



    }
}
