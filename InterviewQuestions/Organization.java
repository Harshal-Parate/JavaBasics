package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Organization {

    public String customerName;
    public String companyName;

    public int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static List<String> name(List<Organization> workable) {
        return workable.stream()
                .sorted((a, b) -> Integer.compare(b.getSalary(),a.getSalary()))
                .filter(e -> e.getSalary()<11)
                .map(e -> e.getCompanyName()+" "+e.getCustomerName()+" "+e.getSalary())
                .collect(Collectors.toList());
    }





    public static void main(String[] args) {


        List<Organization> cases = new ArrayList<>();

        Organization o1 = new Organization();
        o1.setCompanyName("Epam");
        o1.setCustomerName("Harshal");
        o1.setSalary(10);
        cases.add(o1);

        Organization o2 = new Organization();
        o2.setCompanyName("Perfios");
        o2.setCustomerName("Jaiveek");
        o2.setSalary(11);
        cases.add(o2);


        List<String> name = name(cases);

        System.out.println(name);

    }

}

