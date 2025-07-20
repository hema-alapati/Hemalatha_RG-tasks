package q2_lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hemalatha", "Alex", "Janani");

        // Lambda expression to print each name
        names.forEach(name -> System.out.println(name));
    }
}