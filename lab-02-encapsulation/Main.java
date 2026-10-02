import bank.BankAccount;

public class Main {
	
	public static void main(){
		
		init();
		
	}
	
	public static void init() {
		
		BankAccount account = new BankAccount("Кирилл");
		System.out.println("Владелец счёта: " + account.getOwner());
        System.out.println("Начальный баланс: " + account.getBalance() + " руб.");
		
		if (account.deposit(1000)) {
            System.out.println("Положили 1000 руб. Баланс: " + account.getBalance());
        }
		
		if (account.withdraw(300)) {
            System.out.println("Сняли 300 руб. Баланс: " + account.getBalance());
        }
	}
	
}