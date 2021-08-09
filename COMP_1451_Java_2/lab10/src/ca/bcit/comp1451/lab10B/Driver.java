package ca.bcit.comp1451.lab10B;

public class Driver
{

	//main method
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount ("Vlad", 100.00);
		Bank bank = new Bank(account);
		bank.processTransaction();

	}

}
