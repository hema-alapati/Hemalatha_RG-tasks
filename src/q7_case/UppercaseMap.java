package q7_case;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("hema", "alex", "janani");

        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
