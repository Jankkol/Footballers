package pl.project.core;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;


public class AbstractDaoBean<B extends AbstractBean<ID>, ID extends Serializable> extends HibernateDaoSupport 
		implements AbstractDao<B, ID> {
	
	@Transactional
	public void save(B b) {
		getHibernateTemplate().save(b);
	}

	@Transactional
	public void update(B b) {
		getHibernateTemplate().update(b);
	}

	@Transactional
	public void delete(B b) {
		getHibernateTemplate().delete(b);
	}

	@Override
	public B get(ID bean) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public void saveOrUpdate(B b){
        getHibernateTemplate().saveOrUpdate(b);
    }
	
	/*@Override
	public List<B> getAll() {
		// TODO Auto-generated method stub
		return null;
	} */

}
