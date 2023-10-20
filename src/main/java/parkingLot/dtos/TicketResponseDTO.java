package parkingLot.dtos;

import parkingLot.models.Operator;

public class TicketResponseDTO {
    Long ticketId;
    String message;
    Operator operator; // use DTO here.
    String errorCode;

    public TicketResponseDTO(Long ticketId, String message, Operator operator) {
        this.ticketId = ticketId;
        this.message = message;
        this.operator = operator;
    }

    public TicketResponseDTO(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public String getMessage() {
        return message;
    }

    public Operator getOperator() {
        return operator;
    }
}
