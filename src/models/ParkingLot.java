package models;

import java.util.List;

public class ParkingLot extends BaseModel
{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private Status parkingLotStatus;
    private int capacity;
    private List<VehicleType> vehicleTypes;
}
