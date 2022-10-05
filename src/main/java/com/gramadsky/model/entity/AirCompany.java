package com.gramadsky.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "aircompany")
@Data
@Builder
public class AirCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    public String toString() {
        return id + " " + name;
    }
}


