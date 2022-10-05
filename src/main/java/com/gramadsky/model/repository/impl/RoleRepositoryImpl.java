package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.Role;
import com.gramadsky.model.repository.RoleRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class RoleRepositoryImpl extends DefaultRepositoryImpl<Role> implements RoleRepository {

    public List<Role> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from role");

        return query.getResultList();
    }

    public Role findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(Role.class, id);
    }
}
