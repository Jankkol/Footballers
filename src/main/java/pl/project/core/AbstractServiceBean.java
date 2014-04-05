package pl.project.core;

import java.io.Serializable;
import java.util.List;

public class AbstractServiceBean<B extends AbstractBean<ID>, ID extends Serializable>
        implements AbstractService<B, ID> {
    private AbstractDao<B, ID> dao;

    public AbstractDao<B, ID> getDao() {
        return dao;
    }

    public void setDao(AbstractDao<B, ID> dao) {
        this.dao = dao;
    }

    public void save(B b) {
        getDao().save(b);
    }

    public void saveOrUpdate(B b) {
        getDao().saveOrUpdate(b);
    }

    public B get(String id) {
        return getDao().get(id);
    }

    public List<B> getAll() {
        return getDao().getAll();
    }

    public boolean isExist(Long id){
        return getDao().isExist(id);
    }
}
