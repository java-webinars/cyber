package edu.cyber.credit;

public class CreditCard
{
    protected long cardNumber;
    protected double balance;
    protected double apr;
    protected boolean cashback;

    public CreditCard(long cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void useCard() {
    }

    public void payBalance(double balance) {
    }

    @Override
    public String toString() {
        return " credit card | cardNumber: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has cashback: " + cashback;
    }
}
