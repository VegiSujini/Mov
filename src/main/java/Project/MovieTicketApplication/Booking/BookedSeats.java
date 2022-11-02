package Project.MovieTicketApplication.Booking;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor

public class BookedSeats implements Comparable<BookedSeats>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long BookingId;

	private Long movieId;
	private String movieName;
	private Long userId;
	private String screenName;
	private Long amount;
	private LocalDate date;
	private String time;
	private String seatType;
	private int noOfSeats;


	public BookedSeats(Long movieId, String movieName, Long userId, String screenName, Long amount, LocalDate date, String time, String seatType, int noOfSeats) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.userId = userId;
		this.screenName = screenName;
		this.amount = amount;
		this.date = date;
		this.time = time;
		this.seatType = seatType;
		this.noOfSeats = noOfSeats;
	}
	@Override
	public int compareTo(BookedSeats o) {
		if(noOfSeats==o.noOfSeats)
			return 0;
		else if(noOfSeats>o.noOfSeats)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "BookedSeats [BookingId=" + BookingId + ", movieId=" + movieId + ", movieName=" + movieName + ", userId=" + userId + ", " + "screenName=" + screenName + ", " + "amount=" + amount + ", date=" + date + ", time=" + time + ", seatType=" + seatType + ", noOfSeats=" + noOfSeats + "]";
	}



}
