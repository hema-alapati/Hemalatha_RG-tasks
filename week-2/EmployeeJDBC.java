package task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeJDBC {
    Connection conn;

    public EmployeeJDBC() throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paypal_task", "root", "root");
    }

    public void addEmployee(int id, String name, String dept) throws Exception {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO employee VALUES (?, ?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, dept);
        stmt.executeUpdate();
        System.out.println("Added employee " + name);
    }

    public void readEmployees() throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " (" + rs.getString(3) + ")");
        }
    }

    public void updateEmployee(int id, String name, String dept) throws Exception {
        PreparedStatement stmt = conn.prepareStatement("UPDATE employee SET name=?, department=? WHERE id=?");
        stmt.setString(1, name);
        stmt.setString(2, dept);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        System.out.println("Updated employee with ID " + id);
    }

    public void deleteEmployee(int id) throws Exception {
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM employee WHERE id=?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
        System.out.println("Deleted employee with ID " + id);
    }

    public static void main(String[] args) throws Exception {
        EmployeeJDBC db = new EmployeeJDBC();
        db.addEmployee(1, "Hemalatha", "IT");
        db.readEmployees();
        db.updateEmployee(1, "Alex Chris", "CEO");
        db.readEmployees();
        db.deleteEmployee(1);
        db.readEmployees();
    }
}
