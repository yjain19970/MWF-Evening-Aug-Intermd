package parkingLot.dtos;

import parkingLot.models.VehicleType;

public class VehicleDTO {
    private String vehicleNumber;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
