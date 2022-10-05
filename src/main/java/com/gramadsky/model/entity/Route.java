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

    @Column
    private String departure;

    @Column
    private String arrival;

    @OneToMany(mappedBy = "route",cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public String toString(){
        return id + " " + departure + " "+ arrival;
    }
}
