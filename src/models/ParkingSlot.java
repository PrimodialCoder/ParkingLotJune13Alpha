package models;

public class ParkingSlot extends BaseModel
{
    private String number;
    private Status status;
    // If a slot can support multiple vehicles, we convert this to a list
    private VehicleType vehicleType;

    public ParkingSlot(int id) {
        super(id);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
