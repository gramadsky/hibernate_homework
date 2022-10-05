package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String city;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country")
    private Country country;

    public String toString() {
        return id + " " + city + " " + country;
    }
}
