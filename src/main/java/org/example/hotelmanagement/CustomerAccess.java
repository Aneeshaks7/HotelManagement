package org.example.hotelmanagement;

import java.util.Scanner;

public class CustomerAccess {

    public void showCustomerMenu(Scanner scanner) {
        System.out.println("Welcome to the Customer Panel.");
        System.out.println("1. View available rooms");
        System.out.println("2. Make a booking");
        System.out.println("3. View your bookings");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewAvailableRooms();
                break;
            case 2:
                makeBooking();
                break;
            case 3:
                viewBookings();
                break;
            case 4:
                System.out.println("Logging out...");
                return;
            default:
                System.out.println("Invalid choice.");
        }

        showCustomerMenu(scanner);  // Loop back to the customer menu
    }

    private void viewAvailableRooms() {
        System.out.println("Customer is viewing available rooms.");
    }

    private void makeBooking() {
        System.out.println("Customer is making a booking.");
    }

    private void viewBookings() {
        System.out.println("Customer is viewing their bookings.");
    }
}
