package pl.project.core;

import java.io.Serializable;
import java.util.List;

public abstract interface AbstractDao<B extends AbstractBean<ID>, ID extends Serializable> {
	public abstract void save(B bean);

	public abstract void update(B bean);

	public abstract void delete(B bean);

	public abstract B get(ID bean);

    public abstract B get(String id);

    public abstract void saveOrUpdate(B bean);

    public abstract List<B> getAll();
}
