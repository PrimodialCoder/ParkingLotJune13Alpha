package services;

import models.Gate;
import models.Ticket;
import models.VehicleType;
import repositories.GateRespository;

import java.util.Date;
import java.util.Optional;

public class TicketService
{
    private final GateRespository gateRespository;

    public TicketService(GateRespository gateRespository)
    {
        this.gateRespository = gateRespository;
    }

    public Ticket issueTicket(String license_plate, int entry_gate_id,
                              int operator_id, VehicleType vehicleType,
                              int parking_lot_id)
    {
        // 1. Obtain the Gate from the gate_id
        Optional<Gate> gateOptional = gateRespository.findById(entry_gate_id);
        if(gateOptional.isEmpty())
        {
            throw new RuntimeException("Gate not found");
        }

        Gate gate = gateOptional.get();
        // 2. Validate and save the vehicle
        // 3. Assign slot
        // 4. Return ticket
        return null;
    }
}
