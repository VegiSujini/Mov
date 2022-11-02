package Project.MovieTicketApplication.CinemaIF;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Project.MovieTicketApplication.CinemaIF.CinemaIF;

@Repository
public interface CinemaIfRepository extends JpaRepository<CinemaIF,Long>{

}
