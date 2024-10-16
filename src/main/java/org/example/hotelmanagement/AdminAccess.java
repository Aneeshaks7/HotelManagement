package org.example.hotelmanagement;

import java.util.Scanner;

public class AdminAccess {

    public void showAdminMenu(Scanner scanner) {
        System.out.println("Welcome to the Admin Panel.");
        System.out.println("1. View all customers");
        System.out.println("2. Manage bookings");
        System.out.println("3. Manage hotel staff");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewAllCustomers();
                break;
            case 2:
                manageBookings();
                break;
            case 3:
                manageStaff();
                break;
            case 4:
                System.out.println("Logging out...");
                return;
            default:
                System.out.println("Invalid choice.");
        }

        showAdminMenu(scanner);  // Loop back to the admin menu
    }

    private void viewAllCustomers() {
        System.out.println("Admin is viewing all customers.");
    }

    private void manageBookings() {
        System.out.println("Admin is managing bookings.");
    }

    private void manageStaff() {
        System.out.println("Admin is managing hotel staff.");
    }
}
