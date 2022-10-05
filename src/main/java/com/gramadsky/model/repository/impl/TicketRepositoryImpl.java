package com.gramadsky.model.repository.impl;

import com.gramadsky.DataSource;
import com.gramadsky.model.entity.Ticket;
import com.gramadsky.model.repository.TicketRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class TicketRepositoryImpl extends DefaultRepositoryImpl<Ticket> implements TicketRepository {

    public List<Ticket> findAll() {
        Session session = DataSource.getInstance().getSession();

        Query query = session.createQuery("from ticket");

        return query.getResultList();
    }

    public Ticket findById(Integer id) {
        Session session = DataSource.getInstance().getSession();

        return session.get(Ticket.class, id);
    }
}
