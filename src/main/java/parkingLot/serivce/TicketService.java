package parkingLot.serivce;

import parkingLot.exception.GateNotFoundException;
import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.exception.ParkingSpotNotFoundException;
import parkingLot.models.*;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.TicketRepository;
import parkingLot.repository.VehicleRepository;
import parkingLot.strategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService implements ITicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository,
                         SpotAssignmentStrategy spotAssignmentStrategy) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy  = spotAssignmentStrategy;
    }

    @Override
    public Ticket generateTicket(Long gateId, Vehicle vehicle, Long parkingLotId)
            throws ParkingLotNotFoundException, GateNotFoundException, ParkingSpotNotFoundException {
        /**
         *     private ParkingSpot parkingSpot; X
         *     private Date entryTime;  X
         *     private Vehicle vehicle; X DB
         *     private Gate gate; -> DB
         *     private Operator operator; -> X
         */

        Optional<ParkingLot> parkingLot = parkingLotRepository.getParkingLotById(parkingLotId);
        if(!parkingLot.isPresent()){
            throw new ParkingLotNotFoundException("ParkingLot Not Found.");
        }

        Optional<ParkingSpot> ps =  spotAssignmentStrategy.findSpot(vehicle.getVehicleType(),
                 parkingLot.get());

        if(ps.isEmpty()){
            throw new ParkingSpotNotFoundException("ParkingLot is Full");
        }


        Optional<Vehicle> fetchedVehicle =  vehicleRepository.getVehicleById(vehicle.getVehicleNumber());
        if(!fetchedVehicle.isPresent()){
           vehicleRepository.saveVehicle(vehicle);
        }

        Optional<Gate> gate =  gateRepository.getGateById(gateId);
        if(!gate.isPresent()){
            throw new GateNotFoundException("Gate not found");
        }

        /**
         * Construct ticket and return.
         */
        Ticket t = new Ticket(ps.get(), new Date(),vehicle,
                gate.get(),
                gate.get().getCurrentOperator());

        // save the ticket
        Ticket savedTicket = ticketRepository.saveTicket(t);
        return savedTicket;
    }
}
