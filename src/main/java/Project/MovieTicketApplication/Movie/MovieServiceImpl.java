package Project.MovieTicketApplication.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;
	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	@Override
	public List<Movie> fetchAllMovies() {
		return movieRepository.findAll();
	}
	@Override
	public Movie fetchMovieById(Long id) {
		Movie m =  movieRepository.findById(id).orElseThrow(()->new MOVIENOTFOUND());
		System.out.println(m);
		return m;
	}
	@Override
	public List<Movie> fetchMovieInInox() {
		return movieRepository.fetchByType("INOX");
	}
	@Override
	public List<Movie> fetchMovieInPvr() {
		return movieRepository.fetchByType("PVR");
	}
	
	@Override
	public Long getScreenId(Long id) {
		return movieRepository.getScreenId(id);
	}

}
