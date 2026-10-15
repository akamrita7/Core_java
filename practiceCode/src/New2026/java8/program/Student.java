package New2026.java8.program;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private List<String> course;
    public Student(StudentBuilder sb) {
        sb.id = id;
        sb.name = name;
        sb.course = course;
    }

    static class StudentBuilder{
        private Integer id;
        private String name;
        private List<String> course;

        StudentBuilder(Integer id){
            this.id = id;
        }
        public StudentBuilder buildname(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder buildCourse(List<String> course){
            this.course = course;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourse() {
        return course;
    }


}
