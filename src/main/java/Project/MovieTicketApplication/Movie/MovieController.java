package Project.MovieTicketApplication.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MovieController {
	@Autowired
	private MovieServiceImpl movieService;

	@PostMapping("cinema")
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
	
	@GetMapping("allcinemas")
	public List<Movie> fetchAllMovies(){
		return movieService.fetchAllMovies();
	}
	
	@GetMapping("cinema/{id}")
	public Movie fetchById(@PathVariable Long id) {
		return movieService.fetchMovieById(id);
	}
	
	@GetMapping("cinema/inox")
	public List<Movie> fetchByInox(){
		return movieService.fetchMovieInInox();
	}
	@GetMapping("cinema/pvr")
	public List<Movie> fetchByPvr(){
		return movieService.fetchMovieInPvr();
	}
	
	
	@GetMapping("moviescreen/{id}")
	public Long getScreenId(@PathVariable Long id) {
		return movieService.getScreenId(id);
	}
}
