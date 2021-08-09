package a00921638_lab2a;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Vladislav Gudkov(A00921638
 *
 */
public class Bank 
{
	//instance variables
	private String bank_name;
	private HashMap<String, BankAccount> accounts;
	
	//constructor for Bank
	public Bank(String bank_name)
	{
		this.bank_name = bank_name;
		this.accounts = new HashMap<>() ;
	}
	
	
	/**
	 * add_account method
	 * @param account
	 */
	public void add_account (BankAccount account)
	{
		 this.accounts.put(account.get_account_number(),account);
	}
	
	/**
	 * get_account method
	 * @param account
	 */
	public BankAccount get_account(String account_number)
	{
		  return this.accounts.get(account_number);
	}
	
	
	/**
	 * remove_account method
	 * @param account_number
	 * @return BankAccount object
	 */
	public BankAccount remove_account(String account_number)
	{
		 return this.accounts.remove(account_number);
	}
	
	
	/**
	 * get_number_of_accounts method
	 * @return size
	 */
	public int get_number_of_accounts()
	{
		return this.accounts.size();
	}
	
	
	/**
	 * get_total_accounts_balance method
	 * @return total_accounts_balance
	 */
	public double get_total_accounts_balance()
	{
		//local variable for get_total_accounts_balance method
		double total_accounts_balance = 0.0;
	
		//map entry set for accounts
		 for (Map.Entry account_items : this.accounts.entrySet()) 
		 {
	            String key = (String)account_items.getKey();
	            BankAccount bankAccount = (BankAccount) account_items.getValue();
	            total_accounts_balance = total_accounts_balance + bankAccount.get_balance_cdn();
	      }
		 
		 return total_accounts_balance;
	}
	
	/**
	 * @param amount_cdn is deposit amount
	 * @param account_num is account number the deposit is deposited to
	 */
	public void deposit_to(double amount_cdn, String account_num)
	{
		this.accounts.get(account_num).deposit(amount_cdn);
	}

	
	/**
	 * method to print all customer data in the form of a map of accounts
	 */
	public void print_all_customer_data()
	{
		//map entry set for accounts
		 for (Map.Entry account_items : this.accounts.entrySet()) 
		 {
	            String key = (String)account_items.getKey();
	            BankAccount bankAccount = (BankAccount) account_items.getValue();
	            
	            System.out.println("Customer " 
	            + bankAccount.get_member_last_name() 
	            +" has $"+bankAccount.get_balance_cdn() 
	            + " in account #"+bankAccount.get_account_number());
	      }
		 
		 System.out.println("Total bank balance in all accounts for " 
	     + this.bank_name 
	     + " is "+ this.get_total_accounts_balance());  
	}
}
