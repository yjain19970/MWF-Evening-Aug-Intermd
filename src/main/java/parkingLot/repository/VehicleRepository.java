package parkingLot.repository;

import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;

import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    Map<String, Vehicle> vehicleDB;


    public VehicleRepository(Map<String, Vehicle> vehicleDB) {
        this.vehicleDB = vehicleDB;
    }

    public Optional<Vehicle> getVehicleById(String id){
        return Optional.ofNullable(vehicleDB.get(id));
    }

    public Vehicle saveVehicle(Vehicle t){
        return vehicleDB.get(t.getVehicleNumber());
    }
}
