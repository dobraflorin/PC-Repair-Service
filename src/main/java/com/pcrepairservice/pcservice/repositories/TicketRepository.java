package com.pcrepairservice.pcservice.repositories;

import com.pcrepairservice.pcservice.models.dtos.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
