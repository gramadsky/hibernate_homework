package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "route")
    private Route route;

    @Column
    private String passport;

    public String toString(){
        return id + " = " + user + " - " + route + " " + passport;
    }
}
