package pl.project.core.user;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pl.project.core.AbstractDaoBean;
import pl.project.domain.UserBean;

@Component
@Transactional
public class UserDaoBean  extends AbstractDaoBean<UserBean, Long> implements
        UserDao {

	/* @Override
	public void save(UserBean User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserBean User) {
		// TODO Auto-generated method stub
		
	} */

	@Override
	public List<UserBean> getAllUsers() {
        List<UserBean> users = getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(UserBean.class));
		return users;
	}


}
