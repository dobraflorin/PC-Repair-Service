package com.pcrepairservice.pcservice.services;


import com.pcrepairservice.pcservice.repositories.TicketRepository;

public class TicketServiceImpl extends TicketService{

    public TicketServiceImpl(TicketRepository ticketRepository) {
        super(ticketRepository);
    }
}
