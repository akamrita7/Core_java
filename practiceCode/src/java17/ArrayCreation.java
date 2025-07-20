package java17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCreation {
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>(List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F")
        ));
        List<String> list = listOfLists.stream().flatMap(List ::stream ).toList();
        List<String> list1 =listOfLists.stream().flatMap(x -> x.stream()).toList();

        System.out.println(list1);
    }
}
