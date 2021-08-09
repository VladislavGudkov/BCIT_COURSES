package bcit.ca.comp1451.assignment01;
import java.util.ArrayList;
/**
 * @author Vladislav Gudkov (A00921638)
 */
public class Account
{
	//Instance variables
	private Customer customer;
	private String accountNumber;
	private Date dateAccountCreated;
	private double balance;
	private ArrayList <TransactionRecord> transactionRecord;
	
	//Static variables and constants
	public static int uniqueAccountPrefix = 1000;
	private static final String DEPOSIT = "DEPOSIT";
	private static final String WITHDRAW = "WITHDRAW";
	
	//Constructor for class Account
	public Account(Customer customer,  Date dateAccountCreated, double balance)
	{
		setCustomer(customer);
		accountNumber = Integer.toString(uniqueAccountNumber());
		setAccountNumber(accountNumber);
		setDateAccountCreated(dateAccountCreated);
		setBalance(balance);
		transactionRecord = new ArrayList<TransactionRecord>();
	}
	
	//Method to increment unique account number
	private int uniqueAccountNumber()
	{
		uniqueAccountPrefix++;
		return uniqueAccountPrefix;
	}
	
	//Getter method for transactions
	public ArrayList<TransactionRecord> getTransactionRecord() 
	{
		return transactionRecord;
	}

	//Getter method for customer
	public Customer getCustomer()
	{
		return customer;
	}

	//Mutator method for customer
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	//Getter method for accountNumber
	public String getAccountNumber()
	{
		return accountNumber;
	}

	//Mutator method for accountNumber
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	//Getter method for dateAccountCreated
	public Date getDateAccountCreated()
	{
		return dateAccountCreated;
	}

	//Mutator method for dateAccountCreated
	public void setDateAccountCreated(Date dateAccountCreated)
	{
		this.dateAccountCreated = dateAccountCreated;
	}

	//Getter method for balance
	public double getBalance()
	{
		return balance;
	}

	//Mutator method for balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	//Deposit method
	public boolean deposit (double amount)
	{
		if (amount > 0)
		{
			balance = balance + amount;
			TransactionRecord transactionRecord = new TransactionRecord(amount, getDateAccountCreated(), getAccountNumber(), DEPOSIT);
			addTransaction(transactionRecord);
			return true;
		}
		else
		{
			System.out.println("The amount to deposit was invalid");
			return false;
		}
	}
	
	//Withdraw method
	public boolean withdraw (double amount)
	{
		boolean returnValue = false;
		if (amount > 0 && amount <= balance)
		{
			balance = balance - amount;
			TransactionRecord transactionRecord = new TransactionRecord(amount, getDateAccountCreated(), getAccountNumber(), WITHDRAW);
			addTransaction(transactionRecord);
			returnValue = true;
		} 
		else if (amount < 0 || amount > balance)
		{
			System.out.println("Amount cannot be negative or greater than the balance on the account");
		}
		return returnValue;
	}
	
	
	//Method to add the transaction to the arrayList
	public void addTransaction(TransactionRecord transaction) 
	{
		if (transactionRecord != null) 
		{
			transactionRecord.add(transaction);
		} 
		else
		{
			System.out.println("The Transaction to add cannot be null");
		}
	}
	
	
	//Display Details Method for Account
	public void displayAccountInformation()
	{
			int day = getDateAccountCreated().getDay();
			int month = getDateAccountCreated().getMonth();
			int year = getDateAccountCreated().getYear();
			
			System.out.println("Name: " + getCustomer().getName());
			System.out.println("Bank Account: " + getAccountNumber());
			System.out.println("Current Balance: " + getBalance());
			System.out.println("Date of Transaction: " + getDateAccountCreated().dateFormat(day, month, year));		
	}

}
