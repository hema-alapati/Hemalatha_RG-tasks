package task4;

public class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public method to access the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Lazy initialization
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        // Both s1 and s2 refer to the same object
        System.out.println("Are both instances same? " + (s1 == s2)); // true
    }
}
