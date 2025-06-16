package models;

import java.util.Date;

public class Ticket extends BaseModel
{
    private Date entryTime;
    private Vehicle vehicle;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntrygGate() {
        return entrygGate;
    }

    public void setEntrygGate(Gate entrygGate) {
        this.entrygGate = entrygGate;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    private Gate entrygGate;
    private ParkingSlot parkingSlot;
}
