package main;

import controller.Bookingcontroller;
import dao.BookingDAO;
import dao.BookingDAOImpl;

public class Application {
    public static void main(String[] args) {
        BookingDAO bookingDAO = new BookingDAOImpl(); // Create DAO implementation instance
        BookingService bookingService = new BookingServiceImpl(bookingDAO); // Pass DAO to service
        Bookingcontroller controller = new Bookingcontroller(bookingService); // Pass service to controller
        controller.start();
    }

    public static class BookingServiceImpl extends BookingService {

        public BookingServiceImpl(BookingDAO bookingDAO) {
        }
    }
}

