//package com.pcrepairservice.pcservice.services;
//
//import com.pcrepairservice.pcservice.models.entities.Ticket;
//import com.pcrepairservice.pcservice.repositories.TicketRepository;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.stereotype.Service;
//
//@Service
//@AllArgsConstructor
//@Data
//public class TicketService {
//
//    private final TicketRepository ticketRepository;
//
//    public TicketService() {
//        ticketRepository = null;
//    }
//
//    public Ticket createTicket(String issue) {
//        Ticket ticket = new Ticket();
//        ticket.setIssue(issue);
//        return ticketRepository.save(ticket);
//    }
//}