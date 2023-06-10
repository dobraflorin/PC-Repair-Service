package com.pcrepairservice.pcservice.models.dtos;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "client")
    private Set<Ticket> tickets = new HashSet<>();

    public Client() {
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }
}