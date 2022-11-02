package Project.MovieTicketApplication.Booking;

import java.util.List;

public interface BookedSeatsService {
	public BookedSeats saveBookedSeats(BookedSeats booked);
	
	public BookedSeats getBookingById(Long id);
	
	public List<BookedSeats> findAllBookings(Long id);
	
	public boolean deleteBooking(Long id);
	
	public BookedSeats updateBooking(BookedSeats updatedBooking);
}
