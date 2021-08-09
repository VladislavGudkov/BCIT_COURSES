/**
 * @author Vladislav Gudkov(A00921638)
 */

//BankAccount class
public class BankAccount {
	
	//instance variables
	private double balanceCdn;
	private String accountNumber;
	private String lastName;
	
	//BankAccount class constructor
	BankAccount(double balanceCdn, String accountNumber, String lastName)
	{
		super();
		this.balanceCdn = balanceCdn;
		this.accountNumber = accountNumber;
		this.lastName = lastName;
	}
	
	//getter for balanceCdn
	public double getBalanceCdn()
	{
		return balanceCdn;
	}
	
	//getter for accountNumber
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	//getter for lastName
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * withdraw method
	 * @param amount 
	 */
	public void withdraw(double amount)
	{
		this.balanceCdn -= amount;
	}
	
	/**
	 * deposit method
	 * @param amount 
	 */
	public void deposit(double amount)
	{
		this.balanceCdn += amount;
	}
	
	
	/**
	 * transfer method with parameters amountCdn, recipientAccount
	 * @param amountCdn
	 * @param recipientAccount
	 */
	public void transfer(double amountCdn, BankAccount recipientAccount)
	{
		recipientAccount.deposit(amountCdn);
		this.withdraw(amountCdn);
	}
}
