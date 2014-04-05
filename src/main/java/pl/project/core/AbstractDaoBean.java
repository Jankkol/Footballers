package pl.project.core;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;


public class AbstractDaoBean<B extends AbstractBean<ID>, ID extends Serializable> extends HibernateDaoSupport 
		implements AbstractDao<B, ID> {

    private Class<B> domainClass = (Class<B>) ((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0];

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

    @Override
    public B get(String id) {
        List<B> users = getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(domainClass).add(Restrictions.eq("id", Long.parseLong(id))));
        return users.get(0);

    }
	
	/*@Override
	public List<B> getAll() {
		// TODO Auto-generated method stub
		return null;
	} */

}
