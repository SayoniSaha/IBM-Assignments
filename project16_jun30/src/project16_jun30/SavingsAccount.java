package project16_jun30;

public class SavingsAccount implements Accounts {
    private double balance;
    private double interest;

    public SavingsAccount(double initialDeposit, double interest) {
        this.balance = initialDeposit;
        this.interest = interest;
    }

    @Override
    public void deposit(double amnt) {
        balance += amnt;
    }

    @Override
    public void withdraw(double amnt) {
        balance -= amnt;
    }

    @Override
    public double getBalance() {
        return balance;
    }
   
    public void interest() {
        balance += balance * interest/100;
    }
}
