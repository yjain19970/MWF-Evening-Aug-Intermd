package parkingLot.serivce;

import parkingLot.dtos.VehicleDTO;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.TicketRepository;
import parkingLot.repository.VehicleRepository;

public class TicketService implements ITicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket generateTicket(Long gateId, VehicleDTO vehicle, Long parkingLotId) {
        /**
         * 3
         * gateId
         * vehicle
         * parkingLotId
         *
         */

        /**
         *     private ParkingSpot parkingSpot; X
         *     private Date entryTime;  X
         *     private Vehicle vehicle; X DB
         *     private Gate gate; -> DB
         *     private Operator operator; -> X
         */









        return null;
    }
}
