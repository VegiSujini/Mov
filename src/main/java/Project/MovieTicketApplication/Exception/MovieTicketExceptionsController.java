package Project.MovieTicketApplication.Exception;

import Project.MovieTicketApplication.Booking.BOOKINGNOTFOUND;
import Project.MovieTicketApplication.Movie.MOVIENOTFOUND;
import Project.MovieTicketApplication.Screen.SCREENNOTFOUND;
import Project.MovieTicketApplication.User.USERNOTFOUND;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MovieTicketExceptionsController {

	@ExceptionHandler(value = BOOKINGNOTFOUND.class)
	public ResponseEntity<Object> bookingIdNotFound(BOOKINGNOTFOUND exception){
		return new ResponseEntity<Object>("Booking Id is not found in the database.",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = MOVIENOTFOUND.class)
	public ResponseEntity<Object> movieIdNotFound(MOVIENOTFOUND exception){
		return new ResponseEntity<Object>("Movie Id is not found in the database.",HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = SCREENNOTFOUND.class)
	public ResponseEntity<Object> screenIdNotFound(SCREENNOTFOUND exception){
		return new ResponseEntity<Object>("Screen Id is not found in the database.",HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(value = USERNOTFOUND.class)
	public ResponseEntity<Object> userIdNotFound(USERNOTFOUND exception){
		return new ResponseEntity<Object>("User Id is not found in the database.",HttpStatus.NOT_FOUND);
	}
}
