package StreamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Students {
    static List<StudentClass> studentsInfo = new ArrayList<>();

    static {
        studentsInfo.add(
                new StudentClass("Harshal", "parate", 21, "Section A",
                        List.of("Maths", "Science", "English"), 91.90)
        );
        studentsInfo.add(
                new StudentClass("Hitanshu", "Bagde", 22, "Section A",
                        List.of("Hindi", "Marathi", "English"), 90.00)
        );
        studentsInfo.add(
                new StudentClass("Aniket", "Banayat", 23, "Section C",
                        List.of("Sanskrit", "Science", "English"), 89.10)
        );
    }

    public static void main(String[] args) {

        // How to convert data to stream

        // A
        Stream.of(studentsInfo);
        // B
        studentsInfo.stream();


        //How to implement forEach Loop in Streams
        studentsInfo.stream()
                .forEach(studentClass -> System.out.println(studentClass.getEntries()));
        System.out.println("-------------------------");


        // Maps:---
        // Map different type to object to another type of object


        // Collect Method
        // Increased percentage by 1.5 times and collected the list
        List<StudentClass> changedPercentage = studentsInfo.stream()
                .map(studentClass -> new StudentClass(
                        studentClass.getFirstName(),
                        studentClass.getLastName(),
                        studentClass.getRollNo(),
                        studentClass.getclassName(),
                        studentClass.getEntries(),
                        studentClass.getPercentage() * 1.5
                ))
                .collect(Collectors.toList());
        // we can collect the data in set also
        System.out.println(changedPercentage);
        System.out.println("-------------------------");


        // Filter Operations ---> If - Else loop

        List<StudentClass> students = studentsInfo.stream()
                .filter(studentClass -> studentClass.getPercentage() <= 90)
                .collect(Collectors.toList());
        System.out.println(students);
        System.out.println(students.size());
        System.out.println("-------------------------");


        //find first operation <--->  orElse, etc.

        StudentClass student = studentsInfo.stream()
                .filter(o -> o.getPercentage() > 1000)
                .findFirst()
                .orElse(null);
        System.out.println(student);
        System.out.println("-------------------------");


        //FLATMAP --> use to flaten up the data type

        /*
        lets say i have a list of list of strings i.e (List.of(List.of(Strings)) so
        by using flat map on the above condition it'll return me only the List.of(Strings)
         */

        String subjects = studentsInfo.stream()
                .map(studentClass -> studentClass.getEntries())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));
        System.out.println(subjects);
        System.out.println("--------------------------");

        //Short circuiting operator

        List<StudentClass> shortCircuti = studentsInfo.stream()
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(shortCircuti);
        System.out.println("--------------------------");

        //finite data ---
        /*
        convert the infinite list of data into finite one
         */

        List<Double> data = Stream.generate(Math::random)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(data);
        System.out.println("--------------------------");

        // Way second

        Stream.generate(Math::random)
                .limit(10)
                .forEach(values -> {
                    double v = values * 100;
                    System.out.print(v + ",");
                });

        //Way Third

        Stream.generate(Math::random)
                .limit(10)
                .forEach(values -> System.out.println(values + " "));

        //Sorting Operations
        // First Way
        List<StudentClass> sort = studentsInfo.stream()
                .sorted((o1, o2) -> (int) (o2.getPercentage() - o1.getPercentage()))
                .collect(Collectors.toList());
        System.out.println(sort);

        //Second Way
        List<StudentClass> rollNos = studentsInfo.stream()
                .sorted((o1, o2) -> o2.getRollNo()-o1.getRollNo())
                .collect(Collectors.toList());
        System.out.println(rollNos);
        System.out.println("------------------------");

        // Getting Max or Min values out of te stream

        String max = studentsInfo.stream()
                .max(Comparator.comparing(StudentClass::getRollNo))
                .orElseThrow(NoSuchElementException::new)
                .toString();
        System.out.println(max);
        System.out.println("------------------------");

        /*
         Lets say i have to get total marks scored by all the students of class
         then in such cases i'll use the below techniques
         */

        Double totalPer = studentsInfo.stream()
                .map(studentClass -> studentClass.getPercentage())
                .reduce(0.0,Double::sum);
        System.out.println(totalPer);









    }


}

