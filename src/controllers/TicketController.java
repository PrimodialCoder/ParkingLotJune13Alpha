package controllers;

import dtos.IssueRequestDto;
import dtos.IssueResponseDto;
import dtos.ResponseStatus;
import models.Ticket;
import services.TicketService;

public class TicketController
{
    private TicketService ticketService;

    public TicketController(TicketService ticketService)
    {
        this.ticketService = ticketService;
    }

    public IssueResponseDto issueTicket(IssueRequestDto issueRequestDto)
    {
        IssueResponseDto issueResponseDto = new IssueResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(issueRequestDto.getEntry_gate(),
                    issueRequestDto.getEntryTime());

            issueResponseDto.setStatus(ResponseStatus.SUCCESS);
            issueResponseDto.setParking_slot_number(ticket.getParkingSlot().getNumber());
        } catch (Exception e) {
            issueResponseDto.setStatus(ResponseStatus.FAILURE);
            issueResponseDto.setFailureMessage(e.getMessage());
        }

        return issueResponseDto;
    }
}
