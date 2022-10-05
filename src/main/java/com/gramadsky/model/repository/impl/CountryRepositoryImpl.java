package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.Country;
import com.gramadsky.model.repository.CountryRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CountryRepositoryImpl extends DefaultRepositoryImpl<Country> implements CountryRepository {

    public List<Country> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from country");

        return query.getResultList();
    }

    public Country findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(Country.class, id);
    }
}
