package ca.bcit.comp1451.lab10B;

public class BankAccount
{
	//instance variables
	private String name;
	private double balance;
	
	//constructor for class BankAccount
	public BankAccount(String name, double balance) 
	{
		setName(name);
		setBalance(balance);
	}
	
	//get method for name
	public String getName()
	{
		return name;
	}
	
	//set method for name
	public void setName(String name) 
	{
		if (name != null && !name.isEmpty()) 
		{
			this.name = name;
		} 
		else 
		{
			this.name = "unknown name";
		}
	}
	//get method for balance
	public double getBalance()
	{
		return balance;
	}
	
	//set method for balance
	public void setBalance(double balance)
	{
		if (balance > 0)
		{
			this.balance = balance;
		}
	}
	
	//deposit method
	public void deposit(double amount) throws NegativeAmountException 
	{
		if (amount >= 0) 
		{
			double newBalance = balance + amount;
			setBalance(newBalance);
		} 
		else
		{
			throw new NegativeAmountException("Please enter a valid deposit value");
		}
	}
	
	
	//withdraw method
	public void withdraw(double amount) throws InsufficientFundException
	{
		double currentBalance = getBalance();
		if (amount <= 0 && (amount <= currentBalance))
		{
			double withdrawalAmount = currentBalance + amount;
			setBalance(withdrawalAmount);
		}
		else 
		{
			throw new InsufficientFundException("Please enter a valid withdraw value");
		}
	}
	
	//ToString override
	@Override
	public String toString()
	{
		String s = "Name: " + getName() + "is the name, and the balance is:" + getBalance();
		return s;
	}
	
	

}
