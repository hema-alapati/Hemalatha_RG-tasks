package q8_interface;

public class InterfaceTest implements MyInterface {
    public static void main(String[] args) {
        InterfaceTest obj = new InterfaceTest();
        obj.greet();                 // calls default method
        MyInterface.info();          // calls static method
    }
}
