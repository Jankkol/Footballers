package pl.project.core;

import java.io.Serializable;

import javax.persistence.Transient;

public abstract class AbstractBean<E extends Serializable> implements Serializable {

	@Transient
	public abstract E getId();
}
