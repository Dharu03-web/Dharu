package main;

import java.util.ArrayList;
import java.util.List;

public class Bookingservice {

    private List<Booking> bookings;

    public void BookingServices() {
        this.bookings = new ArrayList<>();
    }

    public void userName(String userName, String city, int numberOfTickets) {
        Booking newBooking = new Booking(userName, city, numberOfTickets);
        bookings.add(newBooking);
    }

    public List<Booking> showBookings() {
        return bookings;
    }

    public void reserveTicket(String studentName, String city, int numberOfTickets) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class BookingService{
    private String userName;
    private String city;
    private int numberOfTickets;

    public void Booking(String studentName, String city, int numberOfTickets) {
        this.userName = studentName;
        this.city = city;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public String toString() {
        return "Booking{" +
                " userName='" + userName + '\'' +
                ", city='" + city + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                '}';
    }

    public String getuserName() {
        throw new UnsupportedOperationException("Unimplemented method 'getuserName'");
    }

    public String getNumberOfTickets() {
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfTickets'");
    }

    public String getReferenceNumber() {
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceNumber'");
    }

    public void reserveTicket(String studentName, String city, int numberOfTickets) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<main.Booking> showBookings() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showBookings'");
    }
}
