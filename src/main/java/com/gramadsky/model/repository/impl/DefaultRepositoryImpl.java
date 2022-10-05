package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.repository.DefaultRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.util.List;

public class DefaultRepositoryImpl<T> implements DefaultRepository<T> {

    @Override
    public void save(T entity) {

        Session session = DataSource.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(entity);

        transaction.commit();
    }

    @Override
    public void update(T entity) {
        Session session = DataSource.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(entity);

        transaction.commit();
    }

    @Override
    public void delete(T entity) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.remove(entityManager.contains(entity) ? entityManager : entityManager.merge(entity));

        entityManager.getTransaction().commit();
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(Integer id) {
        return null;
    }


}