package Collections.useOfComaprators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students implements Comparable<Students>{

    private int marks;
    private String studentName;
    private String subject;
    protected List usable;

    public Students() {}
    
    public Students(String subject, String name, int marks){
        this.marks = marks;
        this.subject = subject;
        this.studentName = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void takingInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No. of Subjects");
        int size = s.nextInt();
        usable = new ArrayList<>();
        for(int i=0; i<size; i++) {
            System.out.println("Enter Subjects, Name of Student and Marks");
            Students subject  = new Students(s.next(),s.next(),s.nextInt());
            usable.add(subject);
        }
    }

    public void giveInfo() {
        for(int i=0; i<usable.size(); i++) {
            System.out.println(usable.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "marks=" + marks +
                ", studentName='" + studentName + '\'' +
                ", subject='" + subject + '\'';
    }

    @Override
    public int compareTo(Students marks) {
        return this.marks - marks.marks;
    }
}