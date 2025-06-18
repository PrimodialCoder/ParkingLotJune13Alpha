package controllers;

import dtos.IssueRequestDto;
import dtos.IssueResponseDto;
import dtos.ResponseStatus;
import models.Ticket;
import services.ITicketService;
import services.TicketService;

public class TicketController
{
    private ITicketService ticketService;

    public TicketController(ITicketService ticketService)
    {
        this.ticketService = ticketService;
    }

    public IssueResponseDto issueTicket(IssueRequestDto issueRequestDto)
    {
        IssueResponseDto issueResponseDto = new IssueResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(
                    issueRequestDto.getLicense_plate(),
                    issueRequestDto.getEntry_gate_id(),
                    issueRequestDto.getOperator_id(),
                    issueRequestDto.getVehicle_type(),
                    issueRequestDto.getParkinglot_id()
            );

            issueResponseDto.setStatus(ResponseStatus.SUCCESS);
            issueResponseDto.setParking_slot_number(ticket.getParkingSlot().getNumber());
        } catch (Exception e) {
            issueResponseDto.setStatus(ResponseStatus.FAILURE);
            issueResponseDto.setFailureMessage(e.getMessage());
        }

        return issueResponseDto;
    }
}
