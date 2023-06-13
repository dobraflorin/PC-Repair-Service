//package com.pcrepairservice.pcservice.repositories;
//
//import com.pcrepairservice.pcservice.models.entities.Ticket;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface TicketRepository extends JpaRepository<Ticket, Long> {
//
//    List<Ticket> findByClientId(Long clientId);
//
//    List<Ticket> findByStatus(String status);
//
//    List<Ticket> findByClientIdAndStatus(Long clientId, String status);
//
//    List<Ticket> findByIssueContainingIgnoreCase(String keyword);
//}
