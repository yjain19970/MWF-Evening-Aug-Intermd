package parkingLot.models;

import java.util.Date;

public class Ticket extends BaseModel  {
    private ParkingSpot parkingSpot;
    private Date entryTime;
    private Vehicle vehicle;
    private Gate gate;
    private Operator operator;

    public Ticket(ParkingSpot parkingSpot, Date entryTime,
                  Vehicle vehicle, Gate gate, Operator operator) {
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.gate = gate;
        this.operator = operator;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
