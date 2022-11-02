package Project.MovieTicketApplication.DataBootstrap;

import Project.MovieTicketApplication.CinemaIF.CinemaIF;
import Project.MovieTicketApplication.CinemaIF.CinemaIfServiceImpl;
import Project.MovieTicketApplication.Logging.MyServiceImpl;
import Project.MovieTicketApplication.Movie.Movie;
import Project.MovieTicketApplication.Movie.MovieServiceImpl;
import Project.MovieTicketApplication.Screen.Screen;
import Project.MovieTicketApplication.User.User;
import Project.MovieTicketApplication.User.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component

public class InsertingData {
    @Autowired
    private MyServiceImpl myServiceimpl;
    @Autowired
    private CinemaIfServiceImpl cinemaIfService;
    @Autowired
    private MovieServiceImpl movieService;
    @Autowired
    private UserServiceImpl userService;

    public void insert()
    {
        myServiceimpl.doStuff("Movie Ticket Application");
        //Adding the Admin Data to Database
        User user1 = new User("sujini","vegi","sujinivegi@gmail.com","vegi");
        userService.saveUser(user1);
        Screen s1 = new Screen(50,100,150,"front");
        Screen s2 = new Screen(45,60,125,"rear");
        Movie m1 = new Movie("Prince", LocalDate.of(2022, 10, 24),4);
        m1.setScreen(s1);
        Movie m2 = new Movie("Kantara",LocalDate.of(2022, 10, 5),4);
        m2.setScreen(s2);
        movieService.saveMovie(m1);
        movieService.saveMovie(m2);

        List<Screen> li = new ArrayList<>();
        li.add(s1);
        li.add(s2);

        CinemaIF c1 = new CinemaIF("Sudharshan","PVR");
        cinemaIfService.saveCinema(c1);
        c1.setScreens(li);
        cinemaIfService.saveCinema(c1);

        Screen s3 = new Screen(80,50,120,"front");
        Screen s4 = new Screen(90,100,130,"rear");
        Screen s5 = new Screen(120,160,1950,"3D");
        Movie m3 = new Movie("Pushpa",LocalDate.of(2022, 9, 25),4);
        m3.setScreen(s3);
        Movie m4 = new Movie("RRR",LocalDate.of(2022, 2, 16),4);
        m4.setScreen(s4);
        Movie m5 = new Movie("Iron man",LocalDate.of(2022, 6, 15),4);
        m5.setScreen(s5);
        movieService.saveMovie(m3);
        movieService.saveMovie(m4);
        movieService.saveMovie(m5);

        List<Screen> li1 = new ArrayList<>();
        li1.add(s3);
        li1.add(s4);
        li1.add(s5);

        CinemaIF c2 = new CinemaIF("NSR","INOX");
        cinemaIfService.saveCinema(c2);
        c2.setScreens(li1);
        cinemaIfService.saveCinema(c2);
    }
}
