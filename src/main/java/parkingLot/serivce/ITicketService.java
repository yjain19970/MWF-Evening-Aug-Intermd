package parkingLot.serivce;

import parkingLot.dtos.VehicleDTO;
import parkingLot.models.Ticket;

public interface ITicketService {

    Ticket generateTicket(Long gateId, VehicleDTO vehicle, Long parkingLotId);
}
