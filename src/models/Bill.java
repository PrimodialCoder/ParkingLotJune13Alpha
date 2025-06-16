package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel
{
    private Date exitTime;
    private int totalAmount;
    private Ticket ticket;
    private Gate exitGate;
    private List<Payment> payments; // 500 = 200(cash) + 300(UPI)
}
