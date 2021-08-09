package a00921638_lab2a;
/**
 * @author Vladislav Gudkov(A00921638
 */

//BankAccount class
public class BankAccount {
	
	//instance variables
	private double balance_cdn;
	private String account_number;
	private String member_last_name;
	
	//BankAccount class constructor
	BankAccount(double balance_cdn, String account_number, String member_last_name)
	{
		this.balance_cdn = balance_cdn;
		this.account_number = account_number;
		this.member_last_name = member_last_name;
	}
	
	//getter for balance_cdn
	public double get_balance_cdn()
	{
		return balance_cdn;
	}
	
	//getter for account_number
	public String get_account_number()
	{
		return account_number;
	}
	
	//getter for member_last_name
	public String get_member_last_name()
	{
		return member_last_name;
	}
	
	/**
	 * withdraw method
	 * @param amount 
	 */
	public void withdraw(double amount_cdn)
	{
		this.balance_cdn -= amount_cdn;
	}
	
	/**
	 * deposit method
	 * @param amount 
	 */
	public void deposit(double amount_cdn)
	{
		this.balance_cdn += amount_cdn;
	}
	
	
	/**
	 * transfer method with parameters amountCdn, recipientAccount
	 * @param amount_cdn
	 * @param recipient_account
	 */
	public void transfer(double amount_cdn, BankAccount recipient_account)
	{
		recipient_account.deposit(amount_cdn);
		this.withdraw(amount_cdn);
	}
}