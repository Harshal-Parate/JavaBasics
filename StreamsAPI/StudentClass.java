package StreamsAPI;

import java.util.List;

public final class StudentClass {

    private String firstName;
    private String lastName;
    private int rollNo;
    private String className;
    private List<String> Entries;
    private double percentage;

    public StudentClass(String firstName, String lastName, int rollNo, String className, List<String> entries, double percentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.className = className;
        Entries = entries;
        this.percentage = percentage;
    }

    public StudentClass() {
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", className='" + className + '\'' +
                ", Entries=" + Entries +
                ", Percentage='" + percentage+
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getclassName() {
        return className;
    }

    public void setclassName(String className) {
        this.className = className;
    }

    public List<String> getEntries() {
        return Entries;
    }

    public void setEntries(List<String> entries) {
        Entries = entries;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}