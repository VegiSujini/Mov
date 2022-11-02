package Project.MovieTicketApplication.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.MovieTicketApplication.User.User;
import Project.MovieTicketApplication.User.UserServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/customer")
	public User registerUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/customer/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}

}
