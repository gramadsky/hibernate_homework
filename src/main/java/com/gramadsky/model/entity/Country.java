package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String country;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> cities;

    public String toString() {
        return id + " " + country;
    }
}
