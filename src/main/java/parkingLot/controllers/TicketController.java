package parkingLot.controllers;

import parkingLot.dtos.TicketRequestDTO;
import parkingLot.dtos.TicketResponseDTO;
import parkingLot.models.Ticket;
import parkingLot.serivce.ITicketService;

public class TicketController {
    private ITicketService ticketService;

    public TicketController(ITicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDTO issueTicket(TicketRequestDTO requestDTO) {
        Ticket t = ticketService.generateTicket(requestDTO.getGateId(),
                requestDTO.getVehicle(),
                requestDTO.getParkingLotId());


        return convertTicketToResponseDTO(t);
    }

    private TicketResponseDTO convertTicketToResponseDTO(Ticket t) {
        // mapping log here
        return new TicketResponseDTO();
    }
}
