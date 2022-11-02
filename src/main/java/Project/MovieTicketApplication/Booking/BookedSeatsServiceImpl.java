package Project.MovieTicketApplication.Booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookedSeatsServiceImpl implements BookedSeatsService {

	@Autowired
	private BookedSeatsRepository bookedSeatsRepository;
	@Override
	public BookedSeats saveBookedSeats(BookedSeats booked) {
		return bookedSeatsRepository.save(booked);
	}
	@Override
	public BookedSeats getBookingById(Long id) {
		return bookedSeatsRepository.findById(id).orElseThrow(()->new BOOKINGNOTFOUND());
	}
	
	@Override
	public boolean deleteBooking(Long id) {
		bookedSeatsRepository.deleteById(id);
		return true;

	}
	@Override
	public BookedSeats updateBooking(BookedSeats updatedBooking) {
		BookedSeats bs = new BookedSeats();
		bs.setAmount(updatedBooking.getAmount());
		bs.setBookingId(updatedBooking.getBookingId());
		bs.setDate(updatedBooking.getDate());
		bs.setMovieId(updatedBooking.getMovieId());
		bs.setMovieName(updatedBooking.getMovieName());
		bs.setNoOfSeats(updatedBooking.getNoOfSeats());
		bs.setScreenName(updatedBooking.getScreenName());
		bs.setSeatType(updatedBooking.getSeatType());
		bs.setTime(updatedBooking.getTime());
		bs.setUserId(updatedBooking.getUserId());
		
		return bookedSeatsRepository.save(bs);
	}
	@Override
	public List<BookedSeats> findAllBookings(Long id) {
		return bookedSeatsRepository.findBookedInfo(id);
	}
	
	
	
	
}
