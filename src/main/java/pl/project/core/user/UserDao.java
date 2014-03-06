package pl.project.core.user;

import java.util.List;

import pl.project.domain.UserBean;

public interface UserDao {

	void save(UserBean User);

	void update(UserBean User);

	List<UserBean> getAllUsers();

}
