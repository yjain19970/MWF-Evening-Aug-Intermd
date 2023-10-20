package parkingLot.models;


import java.util.Date;

public class Payment extends BaseModel {
    private int amount; // 10.50 --> 10.50*100 == 1050 --> 1050/100 = 10.50
    // approximations
    // 0.099999999999999999  == 1 --> true
    private PaymentMode mode;
    private PaymentStatus status;
    private String refId;
    private Bill bill;
    private Date time;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
