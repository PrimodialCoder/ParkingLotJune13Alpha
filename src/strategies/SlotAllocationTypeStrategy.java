package strategies;

import models.ParkingLot;
import models.ParkingSlot;
import models.VehicleType;

public interface SlotAllocationTypeStrategy
{
    ParkingSlot allocateSlot(VehicleType vehicleType, ParkingLot parkingLot);
}
