package dao;

import model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDAOImpl implements BookingDAO {
    private List<Booking> bookingList = new ArrayList<>();

    @Override
    public void saveBooking(Booking booking) {
        bookingList.add(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingList;
    }
}
