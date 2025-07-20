package java17.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

//https://www.baeldung.com/java-objects-hash-vs-objects-hashcode
public class Employee {

    private int id ;
    private String name;
    private long phone;
    private String address;

    public Employee(int id, String name, long phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && phone == employee.phone && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); // can be use multiple value
    }

    /*@Override
    public int hashCode() { //as Objects.hashCode take one value at time
        int result = 17;
        result = 31 * result + Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(phone);
        return result;
    }*/

    /*@Override
    public int hashCode() { // before java 7 as hashCode dont have null check
        int result = 17;
        result = 31 * result + id != null ? id.hashCode() : 0;
        result = 31 * result + name != null ? name.hashCode() : 0;
        result = 31 * result + phone != null ? phone.hashCode() : 0;
        return result;
    }*/
    public static void main(String[] args) {
        TreeSet<Employee> tree = new TreeSet<>();
        tree.add(new Employee(1,"",23L,""));
    }
}
