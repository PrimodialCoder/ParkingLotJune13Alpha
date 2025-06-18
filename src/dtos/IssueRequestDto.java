package dtos;

import models.Gate;
import models.Vehicle;
import models.VehicleType;

import java.util.Date;

public class IssueRequestDto
{
    private String license_plate;
    private VehicleType vehicle_type;
    private int operator_id;
    private int entry_gate_id;
    private int parkinglot_id;

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


    public int getParkinglot_id() {
        return parkinglot_id;
    }

    public void setParkinglot_id(int parkinglot_id) {
        this.parkinglot_id = parkinglot_id;
    }

    public int getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(int operator_id) {
        this.operator_id = operator_id;
    }

    public int getEntry_gate_id() {
        return entry_gate_id;
    }

    public void setEntry_gate_id(int entry_gate_id) {
        this.entry_gate_id = entry_gate_id;
    }
}
