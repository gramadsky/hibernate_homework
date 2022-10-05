package com.gramadsky.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "login")
@Data
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String login;

    @Column
    private String password;

    @OneToOne
    @JoinColumn(name = "user")
    private User user;

    public String toString() {
        return id + " " + login + " " + user;
    }
}
