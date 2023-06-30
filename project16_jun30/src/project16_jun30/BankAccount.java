package project16_jun30;

import java.util.*;

public class BankAccount {
    private List<Accounts> accnt;

    public BankAccount() {
        accnt = new ArrayList<>();
    }

    public void addAccount(Accounts account) {
        accnt.add(account);
    }

    public void removeAccount(Accounts account) {
        accnt.remove(account);
    }

    public void deposit(Accounts account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Accounts account, double amount) {
        account.withdraw(amount);
    }

    public void balance() {
        for (Accounts account : accnt) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}