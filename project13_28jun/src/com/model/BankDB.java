package com.model;

import java.util.*;

public class BankDB {
    private Map<String, Double> accn;

    public BankDB() {
        accn = new HashMap<>();
    }

    public void deposit(String accnNo, double amnt) {
        if (amnt > 0) {
            double current = accn.getOrDefault(accnNo, 0.0);
            double updated = current + amnt;
            accn.put(accnNo, updated);
            System.out.println("Deposited successful");
        } else {
            System.out.println("Invalid input");
        }
    }

    public void withdraw(String accnNo, double amnt) {
        if (amnt > 0) {
            double current = accn.getOrDefault(accnNo, 0.0);
            if (current >= amnt) {
                double updated = current - amnt;
                accn.put(accnNo, updated);
                System.out.println("Withdrawn successful");
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    public double getBalance(String accnNo) {
        double balance = accn.getOrDefault(accnNo, 0.0);
        return balance;
    }

    public static void main(String[] args) {
        BankDB bankDB = new BankDB();
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter Account No: ");
                    String depositAccountNumber = sc.next();
                    System.out.print("Enter Deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    bankDB.deposit(depositAccountNumber, depositAmount);
                    break;
                case 2:
                    System.out.print("Enter Account No: ");
                    String withdrawAccountNumber = sc.next();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    bankDB.withdraw(withdrawAccountNumber, withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter Account No: ");
                    String checkBalanceAccountNumber = sc.next();
                    double balance = bankDB.getBalance(checkBalanceAccountNumber);
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (n != 4);
        sc.close();
    }
}
