package models;

import strategies.SlotAllocationTypeStrategy;

import java.util.List;

public class ParkingLot extends BaseModel
{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private Status parkingLotStatus;
    private int capacity;
    private List<VehicleType> vehicleTypes;
    private SlotAllocationTypeStrategy slotAllocationTypeStrategy;

    public SlotAllocationTypeStrategy getSlotAllocationTypeStrategy() {
        return slotAllocationTypeStrategy;
    }

    public void setSlotAllocationTypeStrategy(SlotAllocationTypeStrategy slotAllocationTypeStrategy) {
        this.slotAllocationTypeStrategy = slotAllocationTypeStrategy;
    }

    public ParkingLot() {
        super(-1);
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public Status getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
