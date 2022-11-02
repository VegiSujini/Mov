package Project.MovieTicketApplication.Screen;

import java.util.List;

public interface ScreenService {
	public Screen saveScreen(Screen screen);
	
	public List<Screen> fetchAllScreens();
	
	public Screen fetchScreenById(Long id);
	
	public List<Screen> fetchScreensOfInox();

	public List<Screen> fetchScreensOfPvr();

}
