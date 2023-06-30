package project16_jun30;

public interface Accounts {
	void deposit(double amnt);
    void withdraw(double amnt);
    double getBalance();
    
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account : \nCurrent Deposit: $1000.00, Interest rate: 1.25%");  
        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nCurrent Deposit: $5000.00, Limit: $1000.00");
		bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);
		System.out.println("\nDeposit $1000 to Savings Account");
        bank.deposit(savingsAccount, 100.0);
        System.out.println("Deposit $500 to Current Account");
		bank.deposit(currentAccount, 500.0);	
		System.out.println("Withdraw $200 from Savings Account");
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\nSavings Account and Current Account:");
		bank.balance();
        savingsAccount.interest();
        System.out.println("\nApplying interest on Savings Account for 1 year-");
		System.out.println("Savings Account and Current Account:");
        bank.balance();
    }
}
