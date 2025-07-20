package q3_optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "Hemalatha";
        Optional<String> optionalName = Optional.ofNullable(name);

        optionalName.ifPresentOrElse(
            val -> System.out.println("Name is: " + val),
            () -> System.out.println("Name not provided")
        );
    }
}