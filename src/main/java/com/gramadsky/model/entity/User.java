package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column
    private String name;

    @Column
    private String surname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role")
    private Role role;

    public String toString() {
        return id + " " + name + " " + surname + " " + role;
    }
}