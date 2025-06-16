package models;

public class Payment extends BaseModel
{
    private int amount;
    private PaymentType paymentType;
    private Bill bill;
    private String transaction_id;
    private PaymentStatus paymentStatus;
}
