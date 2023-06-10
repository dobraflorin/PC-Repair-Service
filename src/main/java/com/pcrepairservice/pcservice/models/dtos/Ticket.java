package com.pcrepairservice.pcservice.models.dtos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String issue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructors, getters, and setters

    public Ticket() {
    }

    public Ticket(String issue, Client client) {
        this.issue = issue;
        this.client = client;
    }
}
