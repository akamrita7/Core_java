package java17.util;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDept {
    private String name;
    private String department;
    private double salary;

    public EmployeeDept(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDept{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<EmployeeDept> list = new ArrayList<>();
        list.add(new EmployeeDept("Avni" , "IT" , 15000));
        list.add(new EmployeeDept("Shweta" , "IT" , 10000));
        list.add(new EmployeeDept("Kirti" , "IT" , 11000));
        list.add(new EmployeeDept("Amrita" , "HR" , 18000));
        list.add(new EmployeeDept("PK" , "HR" , 11000));
        list.add(new EmployeeDept("MK" , "HR" , 12000));
        list.add(new EmployeeDept("TK" , "HR" , 12000));

        /*Map<String, Optional<EmployeeDept>> maxSalaryPerDept = */
        //find max salrary of each department
        list.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDept::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeDept::getSalary))
                )).entrySet().forEach(System.out::println);
        //Number of employee in each dept
        list.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDept::getDepartment,
                        Collectors.counting())
                ).entrySet().forEach(System.out::println);
        //sum of salary department wise
        list.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDept::getDepartment,
                        Collectors.summingDouble(EmployeeDept::getSalary))
                ).entrySet().forEach(System.out::println);
        //min max sum of salary deaprtwise
        list.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDept::getDepartment,
                        Collectors.summingDouble(EmployeeDept::getSalary))
                ).entrySet().forEach(System.out::println);
        //What will happen if you use a null list in list.stream()? How do you handle null-safety in stream pipelines?
        List<EmployeeDept> list1 = null;
        Optional.ofNullable(list1)
                .stream()           // stream of zero or one list
                .flatMap(Collection::stream)
                .filter(x -> x.salary <15000)
                .forEach(System.out::println);

        Stream.ofNullable(list)
                .flatMap(Collection::stream)
                .filter(x -> x.salary <15000)
                .forEach(System.out::println);
        List<EmployeeDept> safeList = Objects.requireNonNullElse(list, Collections.emptyList());

        safeList.stream()
                .forEach(System.out::println);

    }

}
