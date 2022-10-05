package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    public String toString() {
        return id + " " + name;
    }
}
