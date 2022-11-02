package Project.MovieTicketApplication.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedSeatsRepository extends JpaRepository<BookedSeats, Long>{
	
	@Query(value = "SELECT * FROM booked_seats WHERE user_id=?;",nativeQuery = true)
	public List<BookedSeats> findBookedInfo(Long id);

}
