package models;

public class CreditCard {
    private double limit;
    private double balance;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
    }

    public boolean makePurchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }
}
