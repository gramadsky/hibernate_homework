package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.Airplane;
import com.gramadsky.model.repository.AirplaneRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AirplaneRepositoryImpl extends DefaultRepositoryImpl<Airplane> implements AirplaneRepository {

    public List<Airplane> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from airplane");

        return query.getResultList();
    }

    public Airplane findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(Airplane.class, id);
    }
}
