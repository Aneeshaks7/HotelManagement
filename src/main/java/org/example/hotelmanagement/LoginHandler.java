package org.example.hotelmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginHandler {

    public void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT role FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String role = rs.getString("role");
                System.out.println(role + " login successful!");

                // Redirect to respective access page based on role
                switch (role) {
                    case "admin":
                        AdminAccess adminAccess = new AdminAccess();
                        adminAccess.showAdminMenu(scanner);
                        break;
                    case "manager":
                        ManagerAccess managerAccess = new ManagerAccess();
                        managerAccess.showManagerMenu(scanner);
                        break;
                    case "customer":
                        CustomerAccess customerAccess = new CustomerAccess();
                        customerAccess.showCustomerMenu(scanner);
                        break;
                    default:
                        System.out.println("Invalid role. Exiting.");
                }
            } else {
                System.out.println("Invalid credentials.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
