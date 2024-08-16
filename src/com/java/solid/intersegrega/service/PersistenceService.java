package com.java.solid.intersegrega.service;

import com.java.solid.intersegrega.entity.Entity;

public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);

}
