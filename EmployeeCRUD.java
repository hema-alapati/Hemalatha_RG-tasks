package task6;

import java.util.*;

public class EmployeeCRUD {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Added: " + e);
    }

    public void readEmployees() {
        System.out.println("Employee List:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void updateEmployee(int id, String newName, String newDept) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setName(newName);
                e.setDepartment(newDept);
                System.out.println("Updated: " + e);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        System.out.println("Deleted employee with ID " + id);
    }

    public static void main(String[] args) {
        EmployeeCRUD crud = new EmployeeCRUD();
        crud.addEmployee(new Employee(1, "Hemalatha", "IT"));
        crud.addEmployee(new Employee(2, "Alex Chris", "CEO"));
        crud.readEmployees();
        crud.updateEmployee(2, "Aishwarya", "Finance");
        crud.readEmployees();
        crud.deleteEmployee(1);
        crud.readEmployees();
    }
}

