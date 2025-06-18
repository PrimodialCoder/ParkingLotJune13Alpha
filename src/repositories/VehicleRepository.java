package repositories;

import models.Vehicle;
import models.VehicleType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository
{
    Map<String, Vehicle> vehicles;
    private static int counter;
    public VehicleRepository()
    {
        vehicles = new HashMap<>();
        counter = 1;
    }

    public Optional<Vehicle> findByLicensePlate(String LicensePlate)
    {
        return Optional.ofNullable(vehicles.get(LicensePlate));
    }

    public Vehicle save(VehicleType vehicleType, String licensePlate)
    {
        Vehicle vehicle = new Vehicle(vehicleType, licensePlate);
        vehicle.setId(counter++);
        vehicles.put(licensePlate, vehicle);
        return vehicle;
    }
}
