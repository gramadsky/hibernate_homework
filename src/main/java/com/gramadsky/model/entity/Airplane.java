package com.gramadsky.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "airplane")
@Data
@Builder
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String model;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airCompany")
    private AirCompany airCompany;

    public String toString() {
        return id + " " + model;
    }
}
