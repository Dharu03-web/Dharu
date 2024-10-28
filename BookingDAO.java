package dao;

import java.util.List;
import model.Booking;

public interface BookingDAO {
    void saveBooking(Booking booking);
    List<Booking> getAllBookings();
}
