package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel
{
    private Date exitTime;
    private int totalAmount;
    private Ticket ticket;
    private Gate exitGate;

    public Bill(int id, Date exitTime, int totalAmount, Ticket ticket, Gate exitGate, List<Payment> payments) {
        super(id);
        this.exitTime = exitTime;
        this.totalAmount = totalAmount;
        this.ticket = ticket;
        this.exitGate = exitGate;
        this.payments = payments;
    }

    private List<Payment> payments; // 500 = 200(cash) + 300(UPI)
}
