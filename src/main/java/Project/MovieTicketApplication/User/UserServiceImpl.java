package Project.MovieTicketApplication.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}


	@Override
	public User getUserById(Long id) {
		return repository.findById(id).orElseThrow(()-> new USERNOTFOUND());
	}
	

}
