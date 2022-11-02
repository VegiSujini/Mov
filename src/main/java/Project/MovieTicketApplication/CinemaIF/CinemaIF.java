package Project.MovieTicketApplication.CinemaIF;

import Project.MovieTicketApplication.Screen.Screen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CinemaIF {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cinemaId;
	private String name;
	private String typeOfCinemaIf;

	// One to many relationship between cinema and screen
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Screen> screens;

	public CinemaIF(String name,String type) {
		super();
		this.name = name;
		typeOfCinemaIf = type;
	}
	@Override
	public String toString() {
		return "CinemaIF [cinemaId=" + cinemaId + ", name=" + name + ", screens=" + screens + "]";
	}


	
	
	
}
