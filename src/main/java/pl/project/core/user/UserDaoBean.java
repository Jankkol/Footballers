package pl.project.core.user;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pl.project.domain.UserBean;

@Component
public class UserDaoBean implements UserDao {

	@Override
	public void save(UserBean User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserBean User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


}
