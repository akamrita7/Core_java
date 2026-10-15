package New2026.java8.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentImp {
    public static void main(String[] args){
        List<Student> stdList = new ArrayList<>();
        stdList.add(new Student.StudentBuilder(100).buildname("abc100").buildCourse(Arrays.asList("english", "Science")).build());
       stdList.add(new Student.StudentBuilder(101).buildname("abc101").buildCourse(Arrays.asList("Science", "SSC")).build());
//        stdList.add(new Student(102, "abc102", Arrays.asList("comp", "english")));
//        stdList.add(new Student(103, "abc103", Arrays.asList("english", "Science")));
        stdList.stream().flatMap(x -> x.getCourse().stream()).distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
