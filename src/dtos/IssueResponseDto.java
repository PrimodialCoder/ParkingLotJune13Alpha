package dtos;

import models.ParkingSlot;

public class IssueResponseDto
{
    private int ticket_id;

    public String getParking_slot_number() {
        return parking_slot_number;
    }

    public void setParking_slot_number(String parking_slot_number) {
        this.parking_slot_number = parking_slot_number;
    }

    private String parking_slot_number;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    private ResponseStatus status;
    private String failureMessage;

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
