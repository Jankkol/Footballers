package pl.project.core;

import java.io.Serializable;

public abstract interface AbstractService<B extends AbstractBean<ID>, ID extends Serializable> {

	public void save(B b);
}
