package q5_FI;

import java.util.function.Consumer;

public class FunctionalRelation {
    public static void main(String[] args) {
        // Using lambda expression with functional interface Consumer<T>
        Consumer<String> printer = message -> System.out.println("Message: " + message);
        printer.accept("Java 8 makes this easy!");
    }
}