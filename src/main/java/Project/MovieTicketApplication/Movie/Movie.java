package Project.MovieTicketApplication.Movie;

import java.time.LocalDate;

import javax.persistence.*;

import Project.MovieTicketApplication.Screen.Screen;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private LocalDate releaseDate;
	private int showCycle;

	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="screen_suj",nullable = false,unique = true)
    Screen screen;



	public Movie(String title, LocalDate releaseDate, int showCycle) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.showCycle = showCycle;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", showCycle=" + showCycle+ ", screen=" + screen + "]";

	}


	
	
	
}

