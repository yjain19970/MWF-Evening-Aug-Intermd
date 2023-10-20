package parkingLot.serivce;

import parkingLot.dtos.VehicleDTO;
import parkingLot.exception.GateNotFoundException;
import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.exception.ParkingSpotNotFoundException;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;

public interface ITicketService {

    Ticket generateTicket(Long gateId, Vehicle vehicle, Long parkingLotId)
            throws ParkingLotNotFoundException, GateNotFoundException, ParkingSpotNotFoundException;
}
