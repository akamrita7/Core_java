package New2026.interview;
/*Using Java8 functionalities, get list of students, whose college name is starting with letter x.
        Map<String,List<String>> //Here Key is college Name and value is student name list*/


import java.util.*;

public class interview1 {
    public static void main(String[] args) {
    List<Student> listofStudent = new ArrayList<>();
    listofStudent.add(new Student(1 , "mini", "sabc"));
    listofStudent.add(new Student(2 , "tini", "sabc"));
    listofStudent.add(new Student(3 , "gini", "sabc"));
    listofStudent.add(new Student(4 , "sini", "sabc"));
        List<Student> listofStudent2 = new ArrayList<>();
        listofStudent.add(new Student(1 , "tina", "xyz"));
        listofStudent.add(new Student(2 , "sina", "xyz"));
        listofStudent.add(new Student(3 , "mina", "xyz"));
        listofStudent.add(new Student(4 , "dina", "xyz"));
        
        


    Map<String, List<Student>> mapOfStudent = new HashMap<>();
    mapOfStudent.put("sabc",listofStudent);
    mapOfStudent.put("xyd", listofStudent2);
    mapOfStudent.forEach((x,y)->{
        if(x.startsWith("s")){
            y.forEach(System.out :: println);
        }
    });
}
}

class Student{
    private Integer id;
    private String name;
    private String collegeName;

    public Student(Integer id, String name, String collegeName) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return collegeName.equals(student.collegeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collegeName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
