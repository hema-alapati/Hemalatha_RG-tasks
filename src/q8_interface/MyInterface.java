package q8_interface;

interface MyInterface {
    default void greet() {
        System.out.println("Hello from default method");
    }

    static void info() {
        System.out.println("Static method inside interface");
    }
}

