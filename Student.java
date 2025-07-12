package task5;

public class Student {
    // Step 1: private variables
    private String name;
    private int age;

    // Step 2: public getter method
    public String getName() {
        return name;
    }

    // Step 3: public setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
