package Project.MovieTicketApplication.User;

import Project.MovieTicketApplication.CinemaIF.CinemaIF;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@Table(name="customer")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;

	// One to many relationship between user and cinema
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
 private List<CinemaIF> cinemaIf;


	public User(String firstName, String lastName,String mail, String password){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;

	}

	@Override
	public String toString() {
		return "User [id=" + id + ",  firstName=" + firstName + ", lastName=" + lastName + ",mail=" + mail + ", password=" + password +"]";
	}
	
	
	
}
