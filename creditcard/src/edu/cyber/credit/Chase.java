package edu.cyber.credit;

public class Chase extends CreditCard
{
    public Chase(long cardNumber, double balance) {
        super(cardNumber, balance);
        this.apr = 10.99;
        this.cashback = true;
    }

    public void useCard() {
        System.out.println("Using Chase card");
    }

    public void payBalance(double balance) {
        System.out.println("Paying " + balance + " from " + this.balance);
    }

    @Override
    public String toString() {
        return "Chase" + super.toString();
    }
}
