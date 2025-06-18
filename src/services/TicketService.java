package services;

import models.*;
import repositories.GateRespository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService implements ITicketService
{
    private final GateRespository gateRespository;
    private final VehicleRepository vehicleRespository;
    private final ParkingLotRepository parkingLotRespository;
    private final TicketRepository ticketRespository;

    public TicketService(GateRespository gateRespository,
                         VehicleRepository vehicleRespository,
                         ParkingLotRepository parkingLotRespository,
                         TicketRepository ticketRespository)
    {
        this.gateRespository = gateRespository;
        this.vehicleRespository = vehicleRespository;
        this.parkingLotRespository = parkingLotRespository;
        this.ticketRespository = ticketRespository;
    }

    @Override
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
        gate.getOperator().setId(operator_id);

        // 2. Validate and save the vehicle
        Optional<Vehicle> vehicleOptional = vehicleRespository.findByLicensePlate(license_plate);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty())
        {
            vehicle = vehicleRespository.save(vehicleType, license_plate);
        }else
        {
            vehicle = vehicleOptional.get();
        }

        // 3. Assign slot
        Optional<ParkingLot> parkingLotOptional = parkingLotRespository.findById(parking_lot_id);
        if(parkingLotOptional.isEmpty())
        {
            throw new RuntimeException("Parking lot not found");
        }

        ParkingLot parkingLot = parkingLotOptional.get();
        ParkingSlot parkingSlot = parkingLot
                .getSlotAllocationTypeStrategy()
                .allocateSlot(vehicleType, parkingLot);

        // 4. Return ticket
        Ticket ticket = new Ticket();
        ticket.setEntryGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);
        return ticketRespository.save(ticket);
    }
}
