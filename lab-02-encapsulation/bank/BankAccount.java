package bank;

public class BankAccount {
	
	private final String owner;
	private double balance;
	
	public BankAccount(String owner) {
		
		this.owner = owner;
		this.balance = 0;
		
	}
	
	public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
	
}