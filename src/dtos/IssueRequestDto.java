package dtos;

import models.Gate;
import models.Vehicle;
import models.VehicleType;

import java.util.Date;

public class IssueRequestDto
{
    private String license_plate;
    private VehicleType vehicle_type;
    private String operator_id;
    private String entry_gate;
    private int parkinglot_id;
    private Date entryTime;

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public VehicleType getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(VehicleType vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    public String getEntry_gate() {
        return entry_gate;
    }

    public void setEntry_gate(String entry_gate) {
        this.entry_gate = entry_gate;
    }

    public int getParkinglot_id() {
        return parkinglot_id;
    }

    public void setParkinglot_id(int parkinglot_id) {
        this.parkinglot_id = parkinglot_id;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
