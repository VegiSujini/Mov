package Project.MovieTicketApplication.Movie;


import java.util.List;

import Project.MovieTicketApplication.Movie.Movie;

public interface MovieService {
	public Movie saveMovie(Movie movie);
	
	public List<Movie> fetchAllMovies();
	
	public Movie fetchMovieById(Long id);
	
	public List<Movie> fetchMovieInInox();
	
	public List<Movie> fetchMovieInPvr();
		
	public Long getScreenId(Long id);

}
