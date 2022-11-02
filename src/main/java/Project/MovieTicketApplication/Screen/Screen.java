package Project.MovieTicketApplication.Screen;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import Project.MovieTicketApplication.Movie.Movie;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long screenId;
	private int middle;
    private int high;
	private int low;
	private String type;

	// One to one relationship between  screen and movie
	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "screen")
	private Movie movie;

	public Screen(int low, int middle, int high,String type) {
	super();
	this.middle = middle;
	this.high =high;
	this.low = low;
	this.type = type;

}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", midddle class=" + middle + ", high class=" + high + ", low class=" + low + ", type=" + type + "]";
	}

	
	
}
