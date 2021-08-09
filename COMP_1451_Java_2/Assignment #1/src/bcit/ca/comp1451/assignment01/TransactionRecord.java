package bcit.ca.comp1451.assignment01;
/**
 * @author Vladislav Gudkov (A00921638)
 */
public class TransactionRecord
{
	//Instance Variables
	private double amountInCad;
	private Date dateIssued;
	private String accountNumber;
	private String TransactionType;
	
	//Constants
	private static final String DEPOSIT = "DEPOSIT";
	private static final String WITHDRAW = "WITHDRAW";
	
	
	//Constructor for TransactionRecord class
	public TransactionRecord(double amountInCad, Date dateIssued, String accountNumber, String TransactionType)
	{
		setAmountInCad(amountInCad);
		setDateIssued(dateIssued);
		setAccountNumber(accountNumber);
		setTransactionType(TransactionType);
	}
	
	//Getter method for amountInCad
	public double getAmountInCad()
	{
		return amountInCad;
	}
	
	//Mutator method for amountInCad
	public void setAmountInCad(double amountInCad)
	{
		if(amountInCad > 0 )
		{
			this.amountInCad = amountInCad;
		}
		else
		{
			System.out.println("Amount value must be greater than 0");
		}
	}
	
	//Getter method for dateIssued
	public Date getDateIssued()
	{
		return dateIssued; 
	}
	
	//Mutator method for dateIssued
	public void setDateIssued(Date dateIssued)
	{
		if (dateIssued != null) 
		{
			this.dateIssued = dateIssued;
		} 
		else 
		{
			throw new IllegalArgumentException("Please provide a valid date of issue");
		}
	}
	
	//Getter method for accountNumber
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	//Mutator method for accountNumber
	public void setAccountNumber(String accountNumber)
	{
		if(accountNumber != null && !accountNumber.isEmpty())
		{
			this.accountNumber = accountNumber;
		}
		else
		{
			System.out.println("Account number cannot be null or an empty string");
		}
	}
	
	//Getter method for transactionType
	public String getTransactionType()
	{
		return TransactionType;
	}
	
	//Mutator for transactionType
	public void setTransactionType(String transactionType)
	{
		if(transactionType.equalsIgnoreCase(DEPOSIT) || transactionType.equalsIgnoreCase(WITHDRAW))
		{
			TransactionType = transactionType;
		}
		else
		{
			System.out.println("Transaction type must be 'withdraw' or 'deposit'");
		}

	}
	
	//Method to display transaction details
	public String displayTransaction(String accountNumber, String transactionType, Date date) {
		
		String transaction = "Account Number: " + accountNumber + "\n" + "Transaction Type: " + transactionType + "\n" +  "Date: " + date;
		return transaction;
	}
	
	
}
