package repositories;

import models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository
{
    Map<Integer, ParkingLot> parkingLots;
    private static int counter;
    public ParkingLotRepository()
    {
        parkingLots = new TreeMap<>();
        counter = 1;
    }

    public Optional<ParkingLot> findById(int parkingLotId)
    {
        return Optional.ofNullable(parkingLots.get(parkingLotId));
    }
}
