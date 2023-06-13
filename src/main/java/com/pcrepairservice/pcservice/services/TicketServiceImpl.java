//package com.pcrepairservice.pcservice.services;
//
//import ch.qos.logback.core.net.server.Client;
//import com.pcrepairservice.pcservice.models.dtos.TicketDTO;
//import com.pcrepairservice.pcservice.models.entities.Ticket;
//import com.pcrepairservice.pcservice.repositories.ClientRepository;
//import com.pcrepairservice.pcservice.repositories.CustomerRepository;
//import com.pcrepairservice.pcservice.repositories.TicketRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class TicketServiceImpl extends TicketService {
//
//    private final TicketRepository ticketRepository;
//    private final CustomerRepository customerRepository;
//
//    @Autowired
//    public TicketServiceImpl(TicketRepository ticketRepository, ClientRepository clientRepository, CustomerRepository customerRepository) {
//        this.ticketRepository = ticketRepository;
//        this.customerRepository = customerRepository;
//        this.ClientRepository = ClientRepository;
//    }
//
//    @Override
//    public TicketDTO createTicket(TicketDTO ticketDTO) {
//        Ticket ticket = mapTicketDtoToEntity(ticketDTO);
//        SimpleJpaRepository clientRepository;
//        Client client = clientRepository.findById(ticketDTO.getClientId())
//                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Client not found"));
//        ticket.setClient(client);
//        Ticket savedTicket = ticketRepository.save(ticket);
//        return mapEntityToTicketDTO(savedTicket);
//    }
//
//    @Override
//    public TicketDTO updateTicket(Long ticketId, TicketDTO ticketDTO) {
//        TicketDTO existingTicket = getTicketById(ticketId);
//        existingTicket.setTitle(ticketDTO.getTitle());
//        existingTicket.setDescription(ticketDTO.getDescription());
//        existingTicket.setIssue(ticketDTO.getIssue());
//        Ticket updatedTicket = ticketRepository.save(existingTicket);
//        return mapEntityToTicketDTO(updatedTicket);
//    }
//
//    @Override
//    public List<TicketDTO> getAllTickets() {
//        List<Ticket> tickets = ticketRepository.findAll();
//        return tickets.stream()
//                .map(this::mapEntityToTicketDTO)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public TicketDTO getTicketById(Long ticketId) {
//        return ticketRepository.findById(ticketId)
//                .map(this::mapEntityToTicketDTO)
//                .orElseThrow(() -> new NotFoundException("Ticket not found"));
//    }
//
//    @Override
//    public void deleteTicket(Long ticketId) {
//        ticketRepository.deleteById(ticketId);
//    }
//
//    private TicketDTO mapEntityToTicketDTO(Ticket ticket) {
//
//    }
//
//    private Ticket mapTicketDtoToEntity(TicketDTO ticketDTO) {
//
//    }
//}