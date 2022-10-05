package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.User;
import com.gramadsky.model.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UserRepositoryImpl extends DefaultRepositoryImpl<User> implements UserRepository {

    public List<User> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from user");

        return query.getResultList();
    }

    public User findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(User.class, id);
    }
}
