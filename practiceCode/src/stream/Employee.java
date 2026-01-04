package stream;

import java.util.List;

public class Employee {
    private int id ;
    private String name;
    private long phone;
    private String address;
    private Course courseList;

    public Employee(int id, String name, long phone, String address, Course courseList) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course getCourseList() {
        return courseList;
    }

    public void setCourseList(Course courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
