package a00921638_lab2a;

public class Main {

	public static void main(String[] args) 
	{
		Bank bank = new Bank("Bank of Kanada");
		
		BankAccount account1 = new BankAccount(100.0, "abc111", "woods");
		BankAccount account2 = new BankAccount(200.0, "def222", "gates");
		BankAccount account3 = new BankAccount(300.0, "ghi333", "bezos");
		BankAccount account4 = new BankAccount(400.0, "jkl444", "zuckerberg");
		
		bank.add_account(account1);
		bank.add_account(account2);
		bank.add_account(account3);
		bank.add_account(account4);
		
		bank.deposit_to(22.22,"def222");

        bank.get_account("abc111").transfer(5.00,bank.get_account("ghi333"));

        bank.print_all_customer_data();
	}

}
