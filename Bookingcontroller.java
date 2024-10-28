package controller;

import java.util.List;
import java.util.Scanner;
import main.Booking;
import main.BookingService;

public class Bookingcontroller {
    public BookingService bookingService;

    public Bookingcontroller(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Name Ticket Booking System");

        while (true) {
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Show Bookings");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User Name: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();

                    System.out.print("Enter Number of Tickets: ");
                    int numberOfTickets = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    bookingService.reserveTicket(studentName, city, numberOfTickets);
                    System.out.println("Tickets reserved successfully!");
                    break;

                case 2:
                    List<main.Booking> bookings = bookingService.showBookings();
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        for (Booking booking : bookings) {
                            System.out.println("User Name: " + booking.getuserName());
                            System.out.println("City: " + booking.getClass());
                            System.out.println("Tickets: " + booking.getNumberOfTickets());
                            System.out.println("Reference Number: " + booking.getReferenceNumber());
                            System.out.println("Seat Number: " + booking.getReferenceNumber());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
