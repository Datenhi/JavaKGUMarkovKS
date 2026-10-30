import except.AccountBlockedException;
import except.InvalidAmountException;
import bank.BankAccount;

public class Main {
	 private static final String OWNER = "Кирилл";
	 private static final boolean BLOCKED = true;
	 private static final boolean NOT_BLOCKED = false;
	 private static final double WITHDRAW_SUM = 200.0;
	 private static final double DEPOSIT_SUM = 1000.0;
	 
	
	 public static void main(String[] args) {
		 
		 init();
		 
	 }
	
    public static void init() {
        BankAccount account = new BankAccount(OWNER);

        System.out.println("Обработка непроверяемого исключения");
        try {
            account.deposit(-DEPOSIT_SUM);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountBlockedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Операция завершена.");
        }

        System.out.println("Делегирование и обработка проверяемого исключения");
        try {
			account.blockedAccount(BLOCKED);
            account.processTransaction(WITHDRAW_SUM);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountBlockedException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Транзакция завершена.");
        }
		
        System.out.println("Встроенное исключение");
        try {
			account.blockedAccount(NOT_BLOCKED);
            account.withdraw(WITHDRAW_SUM);
        }catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountBlockedException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Операция завершена.");
        }
		
		System.out.println("Успешное выполнение");
        try {
			account.deposit(DEPOSIT_SUM);
            account.processTransaction(WITHDRAW_SUM);
        }catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountBlockedException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Транзакция завершена.");
        }
    }
}