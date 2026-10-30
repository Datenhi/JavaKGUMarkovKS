package bank;

import except.AccountBlockedException;
import except.InvalidAmountException;

public class BankAccount {
	private static final double ZERO = 0.0;
	private static final boolean NOT_BLOCKED = false;
	
    private final String owner;
	private double balance;
    private boolean isBlocked;

    public BankAccount(String owner) {
		
		this.owner = owner;
        this.balance = ZERO;
        blockedAccount(NOT_BLOCKED);
		
    }
	
	public void blockedAccount(boolean isBlocked){
		
		this.isBlocked = isBlocked;
		
	}
	
	public void deposit(double amount) throws AccountBlockedException {
		
        if (amount <= ZERO) {
			
            throw new InvalidAmountException("Сумма снятия должна быть больше нуля! Передано: " + amount);
			
        }

        if (isBlocked) {
			
            throw new AccountBlockedException("Операция отклонена: счет заблокирован службой безопасности.");
			
        }

        balance += amount;
        System.out.println("Успешно внесено: " + amount + ". Остаток: " + balance);
    }

    public void withdraw(double amount) throws AccountBlockedException {
		
        if (amount <= ZERO) {
			
            throw new InvalidAmountException("Сумма снятия должна быть больше нуля! Передано: " + amount);
			
        }

        if (isBlocked) {
			
            throw new AccountBlockedException("Операция отклонена: счет заблокирован службой безопасности.");
			
        }

        if (amount > balance) {
			
            throw new IllegalArgumentException("Недостаточно средств на счете.");
			
        }

        balance -= amount;
        System.out.println("Успешно снято: " + amount + ". Остаток: " + balance);
    }

    public void processTransaction(double amount) throws AccountBlockedException {
        System.out.println("Начало обработки транзакции...");
        withdraw(amount);
        System.out.println("Конец обработки транзакции.");
    }
	
	public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
	
}