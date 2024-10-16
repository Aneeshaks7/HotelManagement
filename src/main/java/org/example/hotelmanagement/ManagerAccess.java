package org.example.hotelmanagement;

import java.util.Scanner;

public class ManagerAccess {

    public void showManagerMenu(Scanner scanner) {
        System.out.println("Welcome to the Manager Panel.");
        System.out.println("1. View room availability");
        System.out.println("2. Manage bookings");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewRoomAvailability();
                break;
            case 2:
                manageBookings();
                break;
            case 3:
                System.out.println("Logging out...");
                return;
            default:
                System.out.println("Invalid choice.");
        }

        showManagerMenu(scanner);  // Loop back to the manager menu
    }

    private void viewRoomAvailability() {
        System.out.println("Manager is viewing room availability.");
    }

    private void manageBookings() {
        System.out.println("Manager is managing bookings.");
    }
}
