package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.Login;
import com.gramadsky.model.repository.LoginRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LoginRepositoryImpl extends DefaultRepositoryImpl<Login> implements LoginRepository {

    public List<Login> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from login");

        return query.getResultList();
    }

    public Login findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(Login.class, id);
    }
}
