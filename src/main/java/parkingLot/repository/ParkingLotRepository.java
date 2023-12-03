package parkingLot.repository;

import parkingLot.models.ParkingLot;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotDB; // DB
    private long lastSavedId = 0L;

    public ParkingLotRepository(Map<Long, ParkingLot> parkingLotDB) {
        this.parkingLotDB = parkingLotDB;
    }


    public Optional<ParkingLot> getParkingLotById(Long id){
        return Optional.ofNullable(parkingLotDB.get(id));
    }

    public ParkingLot saveParkingLot(ParkingLot lot){
        lastSavedId++;
        lot.setId(lastSavedId);
        parkingLotDB.put(lastSavedId, lot);

        return parkingLotDB.get(lastSavedId);
    }


}
