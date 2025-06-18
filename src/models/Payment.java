package models;

public class Payment extends BaseModel
{
    private int amount;
    private PaymentType paymentType;
    private Bill bill;
    private String transaction_id;
    private PaymentStatus paymentStatus;

    public Payment(int id, int amount, PaymentType paymentType, Bill bill, String transaction_id, PaymentStatus paymentStatus) {
        super(id);
        this.amount = amount;
        this.paymentType = paymentType;
        this.bill = bill;
        this.transaction_id = transaction_id;
        this.paymentStatus = paymentStatus;
    }
}
