package com.gramadsky.model.repository;

import java.util.List;

public interface DefaultRepository <T> {

    void save(T entity);

    void delete(T entity);

    List<T> findAll();

    T findById(Integer id);

    void update(T entity);
}
