package stream;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Course crs = new Course("com");
        Employee e = new Employee(1, "nita", 78,"bang",crs);
        Optional<String> optionalName = Optional.ofNullable(getName());
        optionalName.ifPresent(name -> System.out.println("Name: " + name));
        String name = optionalName.orElse("Default Name");
         name = optionalName.orElseGet(() -> getDefaultNameFromDatabase());
        optionalName.orElseThrow(() -> new IllegalArgumentException("Name not found"));
        String version = Optional.ofNullable(e)
                .map(Employee::getName)
                .orElse("Unknown");

    }

    private static String getDefaultNameFromDatabase() {
       return  "Deepa";
    }

    private static String getName() {
        return "Nita";
    }
}
