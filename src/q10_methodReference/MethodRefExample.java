package q10_methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hema", "Latha", "Java");

        // Using method reference instead of: name -> printName(name)
        names.forEach(MethodRefExample::printName);
    }
}
