package service;

import java.util.List;
import model.Booking;

public interface Bookingservice {
    void reserveTicket(Booking booking);
    List<Booking> showBookings();
}
