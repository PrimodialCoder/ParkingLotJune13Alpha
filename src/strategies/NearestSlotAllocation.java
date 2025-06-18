package strategies;

import models.*;

public class NearestSlotAllocation implements SlotAllocationTypeStrategy{
    @Override
    public ParkingSlot allocateSlot(VehicleType vehicleType, ParkingLot parkingLot)
    {
        for (ParkingFloor floor : parkingLot.getParkingFloors())
        {
            for(ParkingSlot slot : floor.getParkingSlots())
            {
                if(slot.getVehicleType().equals(vehicleType) &&
                slot.getStatus() == Status.AVAILABLE)
                {
                    slot.setStatus(Status.FULL);
                    return slot;
                }
            }
        }
        return null;
    }
}
