package Project.MovieTicketApplication.Screen;

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
public class ScreenController {
	@Autowired
	private ScreenServiceImpl serviceImpl;
	
	@PostMapping("/screen")
	public Screen saveScreen(@RequestBody Screen screen) {
		return serviceImpl.saveScreen(screen);
	}
	
	@GetMapping("/allscreens")
	public List<Screen> fetchAllScreens(){
		return serviceImpl.fetchAllScreens();
	}
	
	@GetMapping("/screen/{id}")
	public Screen fetchById(@PathVariable Long id ) {
		return serviceImpl.fetchScreenById(id);
	}
	@GetMapping("/screen/inox")
	public List<Screen> getScreensOfInox(){
		return serviceImpl.fetchScreensOfInox();
	}
	@GetMapping("/screen/pvr")
	public List<Screen> getScreensOfPvr(){
		return serviceImpl.fetchScreensOfPvr();
	}
}
