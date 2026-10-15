package New2026.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmpImp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ana", List.of("oracle","scjp"),"F"));
        employeeList.add(new Employee("sana", List.of("oracle","scjp"),"F"));
        employeeList.add(new Employee("mana", List.of("oracle","scjp"),"M"));
        employeeList.add(new Employee("tana", List.of("oracle","safe"),"M"));
        //System.out.println(employeeList.stream().filter(x->x.getGender().equals("F") && x.getCourse().contains("scjp")).count());
         //employeeList.stream().flatMap(x -> x.getCourse().stream()).distinct().forEach(System.out::println);
                //Map newMap = employeeList.stream().collect(Collectors.toMap(Employee::getGender , x-> x.getCourse().stream().distinct().count()));
        //newMap.forEach((x,y) -> System.out.println(x + " " +y));
        Map newMap = employeeList.stream().collect(Collectors.toMap(Employee::getName,employee -> employee.getCourse().stream().count()));
        //employeeList.stream().collect(Collectors.toMap(e -> e.getName() , e -> e.getCourse()));
        newMap.forEach((x,y) -> System.out.println(x + " " +y));
        employeeList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        employeeList.sort(Comparator.comparing(Employee::getName));
        employeeList.stream().sorted(Comparator.comparing(Employee ::getName).thenComparing(Employee::getAge).reversed()).collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        List<Integer> l1 = Arrays.asList(1, 2,3 , 4);
        List<Integer> l3 = Arrays.asList(5, 6, 7);
        List<Integer> l4 = Arrays.asList(7, 8, 9);
        List<List<Integer>> l2 = new ArrayList<>();
        l2.add(l1);
        l2.add(l3);
        l2.add(l4);
        List<Integer> l5 =l2.stream().flatMap(x -> x.stream()).sorted().collect(Collectors.toList());
        l5.forEach(System.out::print);



    }

}
