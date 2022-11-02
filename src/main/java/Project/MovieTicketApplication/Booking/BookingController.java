package Project.MovieTicketApplication.Booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testng.annotations.Test;

@RestController
@CrossOrigin(origins = "*")
public class BookingController {

	@Autowired
	BookedSeatsServiceImpl bookedSeatsServiceImpl;
	@PostMapping("bookings")
	public BookedSeats saveBooking(@RequestBody BookedSeats booked) {
		return bookedSeatsServiceImpl.saveBookedSeats(booked);
	}

	@GetMapping("allbookings/{id}")
	public List<BookedSeats> finaAllBookingsById(@PathVariable Long id){
		return bookedSeatsServiceImpl.findAllBookings(id);
	}
	
	@PutMapping("updatebooking")
	public BookedSeats updateBookings(@RequestBody BookedSeats bookedSeats) {
		return bookedSeatsServiceImpl.updateBooking(bookedSeats);
	}
	
	@DeleteMapping("deletebooking/{id}")
	public boolean deleteBooking(@PathVariable Long id) {
		return bookedSeatsServiceImpl.deleteBooking(id);
	}
	
	@GetMapping("booking/{id}")
	public BookedSeats findById(@PathVariable Long id) {
		return bookedSeatsServiceImpl.getBookingById(id);
	}
}
