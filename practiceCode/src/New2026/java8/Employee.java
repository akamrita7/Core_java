package New2026.java8;

import java.util.List;

public class Employee {
    private String name;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private List<String> course;
    private String gender;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    private Integer age;

    public Employee(String name, List<String> course, String gender) {
        this.name = name;
        this.course = course;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<String> getCourse() {
        return course;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
