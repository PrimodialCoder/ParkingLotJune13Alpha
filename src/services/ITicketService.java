package services;

import models.Ticket;
import models.VehicleType;

public interface ITicketService
{
    Ticket issueTicket(String license_plate, int entry_gate_id,
                       int operator_id, VehicleType vehicleType,
                       int parking_lot_id);
}
