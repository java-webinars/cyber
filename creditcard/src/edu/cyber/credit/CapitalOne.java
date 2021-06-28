package edu.cyber.credit;

public class CapitalOne extends CreditCard
{
    public CapitalOne(long cardNumber, double balance) {
        super(cardNumber, balance);
        this.apr = 14.35;
        this.cashback = false;
    }

    public void useCard() {
        System.out.println("Using Capital One card");
    }

    public void payBalance(double balance) {
        System.out.println("Paying " + balance + " from " + this.balance);
    }

    @Override
    public String toString() {
        return "Capital One" + super.toString();
    }
}
