package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "route")
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departure")
    private City departure;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arrival")
    private City arrival;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public String toString() {
        return id + " - " + departure + " - " + arrival;
    }
}
