package parkingLot.dtos;

public class TicketRequestDTO {
    Long parkingLotId;
    VehicleDTO vehicle;
    Long gateId;

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public VehicleDTO getVehicle() {
        return vehicle;
    }

    public Long getGateId() {
        return gateId;
    }
}
