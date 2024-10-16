package org.example.hotelmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SignupHandler {

    public void signup(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO users (username, password, role) VALUES (?, ?, 'customer')";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Customer signup successful!");
            } else {
                System.out.println("Signup failed.");
            }
        } catch (SQLException e) {
            System.out.println("Username already exists or database error.");
            e.printStackTrace();
        }
    }
}
