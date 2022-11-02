package Project.MovieTicketApplication;

import Project.MovieTicketApplication.Booking.BookedSeats;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieTicketApplicationTests {

	@Test
	void contextLoads() {
	}
	@org.testng.annotations.Test
	public void equalsHashCodeContracts() {
		EqualsVerifier.forClass(MovieTicketApplication.class).verify();
	}

}
