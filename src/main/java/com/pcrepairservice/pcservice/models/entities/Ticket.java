//package com.pcrepairservice.pcservice.models.entities;
//
//import ch.qos.logback.core.net.server.Client;
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name = "tickets")
//@Data
//public class Ticket {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    private String issue;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "client_id")
//    private Customer customer;
//
//    public Ticket() {
//    }
//
//    public Ticket(String issue, Customer customer) {
//        this.issue = issue;
//        this.customer = customer;
//    }
//
//    public void setIssue(String issue) {
//        this.issue = issue;
//    }
//
//    public void setClient(Client client) {
//    }
//}