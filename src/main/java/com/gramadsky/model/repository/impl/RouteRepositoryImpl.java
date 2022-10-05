package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.Route;
import com.gramadsky.model.repository.RouteRepository;
import org.hibernate.Session;

import org.hibernate.query.Query;

import java.util.List;

public class RouteRepositoryImpl extends DefaultRepositoryImpl<Route> implements RouteRepository {

    public List<Route> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from route");

        return query.getResultList();
    }

    public Route findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(Route.class, id);
    }
}
