package Project.MovieTicketApplication.Screen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScreenServiceImpl implements ScreenService {
	@Autowired
	private ScreenRepository screenRepository;
	@Override
	public Screen saveScreen(Screen screen) {
		return screenRepository.save(screen);
	}
	@Override
	public List<Screen> fetchAllScreens() {
		return screenRepository.findAll();
	}
	@Override
	public Screen fetchScreenById(Long id) {
		return screenRepository.findById(id).orElseThrow(()->new SCREENNOTFOUND());
	}
	@Override
	public List<Screen> fetchScreensOfInox() {
		return screenRepository.fetchByType("INOX");
	}
	@Override
	public List<Screen> fetchScreensOfPvr() {
		return screenRepository.fetchByType("PVR");

	}
	


}
