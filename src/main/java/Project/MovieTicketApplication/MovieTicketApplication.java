package Project.MovieTicketApplication;

import Project.MovieTicketApplication.DataBootstrap.InsertingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MovieTicketApplication implements CommandLineRunner {

	@Autowired
	private final InsertingData insertingData;

	public MovieTicketApplication(InsertingData insertingData) {
		this.insertingData = insertingData;
	}

	public static void main(String[] args) {
		
		SpringApplication.run(MovieTicketApplication.class, args);
	}

	public void run(String... args) {
		insertingData.insert();
	}

}
