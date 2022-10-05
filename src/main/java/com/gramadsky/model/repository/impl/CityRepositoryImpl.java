package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.City;
import com.gramadsky.model.repository.CityRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CityRepositoryImpl extends DefaultRepositoryImpl<City> implements CityRepository {

    public List<City> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from city");

        return query.getResultList();
    }

    public City findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(City.class, id);
    }
}
