package parkingLot.controllers;

import parkingLot.dtos.TicketRequestDTO;
import parkingLot.dtos.TicketResponseDTO;
import parkingLot.exception.GateNotFoundException;
import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.exception.ParkingSpotNotFoundException;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;
import parkingLot.serivce.ITicketService;

public class TicketController {
    private ITicketService ticketService;

    public TicketController(ITicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDTO issueTicket(TicketRequestDTO requestDTO) {
        Ticket t = null;
        try {
            t = ticketService.generateTicket(requestDTO.getGateId(),
                    new Vehicle(requestDTO.getVehicle().getVehicleNumber(),
                            requestDTO.getVehicle().getVehicleType()),
                    requestDTO.getParkingLotId());

        } catch (ParkingLotNotFoundException e) {
            return new TicketResponseDTO(" ParkingLot Not Found. Id was Incorrect.",
                    "400");
        } catch (GateNotFoundException e) {
            return new TicketResponseDTO(" GateId was Incorrect!",
                    "400");
        } catch (ParkingSpotNotFoundException e) {
            return new TicketResponseDTO(" ParkingLot is full. Sorry!",
                    "201");
        } catch (Exception e){
            return new TicketResponseDTO("Something went wrong!","500");
        }

        return convertTicketToResponseDTO(t);
    }

    private TicketResponseDTO convertTicketToResponseDTO(Ticket t) {
        return new TicketResponseDTO(t.getId(),
                "Ticket is generated!",
                t.getOperator());
    }
}
