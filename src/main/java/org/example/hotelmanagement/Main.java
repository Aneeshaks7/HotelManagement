package org.example.hotelmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hotel Management System");
        System.out.println("1. Login");
        System.out.println("2. Signup (Customers only)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            LoginHandler loginHandler = new LoginHandler();
            loginHandler.login(scanner);
        } else if (choice == 2) {
            SignupHandler signupHandler = new SignupHandler();
            signupHandler.signup(scanner);
        } else {
            System.out.println("Invalid choice. Exiting.");
        }

        scanner.close();
    }
}