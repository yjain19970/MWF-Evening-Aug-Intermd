package parkingLot.repository;

import parkingLot.models.Ticket;

import java.util.Map;

public class TicketRepository {
    Map<Long, Ticket> ticketDB;
    private long lastSavedId = 0L;

    public TicketRepository(Map<Long, Ticket> ticketDB) {
        this.ticketDB = ticketDB;
    }

    public Ticket getTicketById(Long id){
        return ticketDB.get(id);
    }

    public Ticket saveTicket(Ticket t){
        lastSavedId++;
        t.setId(lastSavedId);
        ticketDB.put(lastSavedId,t);
        return ticketDB.get(lastSavedId);
    }

}
