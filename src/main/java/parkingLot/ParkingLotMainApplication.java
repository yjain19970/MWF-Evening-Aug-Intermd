package parkingLot;

import parkingLot.controllers.TicketController;
import parkingLot.models.Ticket;
import parkingLot.repository.*;
import parkingLot.serivce.ITicketService;
import parkingLot.serivce.TicketService;
import parkingLot.strategy.RandomSpotAssignmentStrategy;
import parkingLot.strategy.SpotAssignmentStrategy;

import java.util.HashMap;

public class ParkingLotMainApplication {

    public static void main(String[] args) {
        GateRepository gateRepo = new GateRepository(new HashMap<>());
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(new HashMap<>());
        VehicleRepository vehicleRepository = new VehicleRepository(new HashMap<>());
        TicketRepository ticketRepository = new TicketRepository(new HashMap<>());
        SpotAssignmentStrategy spotAssignmentStrategy = new RandomSpotAssignmentStrategy();

        ITicketService ticketService  = new TicketService(gateRepo,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository,
                spotAssignmentStrategy);

        TicketController ticketController = new TicketController(ticketService);




    }
}
