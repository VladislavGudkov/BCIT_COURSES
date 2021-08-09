//COMP 1451 LAB 4B
//VLADISLAV GUDKOV (A00921638)

package ca.bcit.comp1451.lab4b;
import java.util.HashMap;

public class BankAccount
{
	//Instance variables
	private double balance;
	private String name;
	private static HashMap<String, Double> userAccount;
	
	//Symbolic constants
	private final static double INTEREST_RATE = 1.05; 
	private final static double DEFAULT_BALANCE = 0.0;


	
	//Creates a new bank account with 2 parameters
	public BankAccount(String name, double balance)
	{
		setName(name);
		setBalance(balance);
		//also creates a hashmap of the user accounts 
		setUserAccount(new HashMap<String, Double>());
	}
	
	//constructor to create a new account with just one parameter
	public BankAccount(String name)
	{
		setName(name);
		balance = DEFAULT_BALANCE;
		setUserAccount(new HashMap<String, Double>());
	}
	
	//Getter method for the balance of the account
	public double getBalance() 
	{
		return balance;
	}
	
	//getter method for the name of the account
	public String getName() 
	{
		return name;
	}

	
	
	//Setter method for the balance 
	public void setBalance(double balance) 
	{
		if (balance >= 0)
		{
			this.balance = balance;
		} 
		else
		{
			this.balance = DEFAULT_BALANCE;
		}
	}

	
	//Setter method for the account name
	public void setName(String name) 
	{
		if (name != null && !name.isEmpty()) 
		{
			this.name = name;
		} 
		else 
		{
			System.out.println("The name of the account cannot be null or an empty string");
		}
		
	}
	
	//Setter method to create a hashmap of bank accounts
	public static void setUserAccount(HashMap<String, Double> userAccount)
	{
		if (userAccount != null)
		{
			BankAccount.userAccount = userAccount;
		}
		
	}
	
	
	//Deposit method
	public void deposit(double amount)
	{
		if (amount > 0) 
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("The amount must be greater than 0");
		}
	}
	
	//Withdraw method
	public void withdraw(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			balance = balance - amount;
		} 
		else 
		{
			System.out.println("The withdraw amount must be greater than 0 and less than or equal to the account balance");
		}
	}
	
	//Applies interest at 5% to the account balance
	public void applyInterest() 
	{
		balance = balance * INTEREST_RATE; 
	}

}
