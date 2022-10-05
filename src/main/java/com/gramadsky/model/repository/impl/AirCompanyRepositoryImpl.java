package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.AirCompany;
import com.gramadsky.model.repository.AirCompanyRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AirCompanyRepositoryImpl extends DefaultRepositoryImpl<AirCompany> implements AirCompanyRepository {

    public List<AirCompany> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from aircompany");

        return query.getResultList();
    }

    public AirCompany findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(AirCompany.class, id);
    }
}
