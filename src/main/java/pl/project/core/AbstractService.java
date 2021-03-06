package pl.project.core;

import java.io.Serializable;
import java.util.List;

public abstract interface AbstractService<B extends AbstractBean<ID>, ID extends Serializable> {

    public void save(B b);

    public void saveOrUpdate(B b);

    public B get(ID id);
    
    public void delete(B bean);

    public List<B> getAll();

    public boolean isExist(Long id);
}
