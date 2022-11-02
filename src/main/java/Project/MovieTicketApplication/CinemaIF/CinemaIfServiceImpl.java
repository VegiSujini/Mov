package Project.MovieTicketApplication.CinemaIF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Project.MovieTicketApplication.CinemaIF.CinemaIF;
import Project.MovieTicketApplication.CinemaIF.CinemaIfRepository;
import Project.MovieTicketApplication.CinemaIF.CinemaIfService;

@Service
@Transactional
public class CinemaIfServiceImpl implements CinemaIfService{
	@Autowired
	private CinemaIfRepository cinemaIfRepository;
	@Override
	public CinemaIF saveCinema(CinemaIF cinema) {
		return cinemaIfRepository.save(cinema);
	}

}
