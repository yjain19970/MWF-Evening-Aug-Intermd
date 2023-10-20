package parkingLot.repository;

import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;

import java.util.Map;

public class VehicleRepository {
    Map<Long, Vehicle> vehicleDB;
    private long lastSavedId = 0L;

    public VehicleRepository(Map<Long, Vehicle> vehicleDB) {
        this.vehicleDB = vehicleDB;
    }

    public Vehicle getTicketById(Long id){
        return vehicleDB.get(id);
    }

    public Vehicle saveTicket(Vehicle t){
        lastSavedId++;
        t.setId(lastSavedId);
        vehicleDB.put(lastSavedId,t);
        return vehicleDB.get(lastSavedId);
    }
}
