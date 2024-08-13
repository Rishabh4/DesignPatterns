package com.java.solid.intersegrega.service;

import com.java.solid.intersegrega.entity.Entity;

public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
}
