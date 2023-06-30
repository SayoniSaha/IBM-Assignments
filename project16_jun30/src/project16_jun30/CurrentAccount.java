package project16_jun30;

public class CurrentAccount implements Accounts {
    private double balance;
    private double limit;

    public CurrentAccount(double current, double limit) {
        this.balance = current;
        this.limit = limit;
    }

    @Override
    public void deposit(double amnt) {
        balance += amnt;
    }

    @Override
    public void withdraw(double amnt) {
        if (balance + limit >= amnt) {
            balance -= amnt;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void limit(double limit) {
        this.limit = limit;
    }
}
