package Classes.Assignment_001;

import java.util.Scanner;

public class ATBStudents {
    private String[] name;
    private int[] rollNo;

    public int[] getRollNo() {
        return rollNo;
    }

    public void setRollNo(int[] rollNo) {
        this.rollNo = rollNo;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public ATBStudents() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No. of Students in class");

        int size = s.nextInt();
        int[] roll = new int[size];
        String[] name = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Roll Number of " + (i + 1) + "th followed by Name of Student");
            roll[i] = s.nextInt();
            name[i] = s.next();
        }
        setName(name);
        setRollNo(roll);

        s.close();
    }

    public void printInfoOfStudents() {
        for(int i=0; i< rollNo.length; i++) {
            System.out.println(getName()[i] +"-->"+ getRollNo()[i]);
        }
    }

}
