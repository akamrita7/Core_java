package New2026.java8.program;

import java.util.List;
import java.util.stream.Collectors;

public class rakuten2 {
    public static void main(String[] args) {
//        List<Employee> empList = getEmployeeList();


    }

    private static void getEmployeeList(List<Employe> list) {
        list.stream().filter(x -> x.getDept().equals("HR")).map(x -> {
            int sal = x.getSalary();
            sal +=  10/100*sal;
            x.setSalary(sal);
            return x;
        })
    .collect(Collectors.toList());
    }
}
class Employe{
    String name;

    int salary;
    String Dept;
    public Employe() {

    }

    public Employe(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        Dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return Dept;
    }
}
