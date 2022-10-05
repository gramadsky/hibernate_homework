package com.gramadsky;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataSource {

    private static DataSource dataSource = new DataSource();

    private static EntityManagerFactory entityManagerFactory;

    private DataSource() {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.gramadsky");
    }

    public static DataSource getInstance() {
        return dataSource;
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public Session getSession() {
        return getEntityManager().unwrap(Session.class);
    }
}
