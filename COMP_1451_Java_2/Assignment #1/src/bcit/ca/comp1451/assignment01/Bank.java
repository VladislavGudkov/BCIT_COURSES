package bcit.ca.comp1451.assignment01;
/**
 * @author Vladislav Gudkov (A00921638)
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.Scanner;

public class Bank
{
	//Instance Variables
	private String bankName;
	private static HashMap<String, Account> accountObjects;
	private static Scanner input;
	
	//Symbolic constants
	private static final int DEFAULT_DAY = 1;
	private static final int DEFAULT_MONTH = 1;
	private static final int DEFAULT_YEAR = 2020;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	
	//Constructor for class bankName
	public Bank(String bankName, HashMap<String, Account> accountObject) 
	{
		setBankName(bankName);
		accountObject = new HashMap<String, Account>(); 
		//setAccountObject(accountObject);
		input = new Scanner(System.in);
	}
	
	//Getter method for bankName
	public String getBankName()
	{
		return bankName;
	}
	
	//Mutator method for bankName
	public void setBankName(String bankName)
	{
		if(bankName != null && !bankName.isEmpty())
		{
			this.bankName = bankName;
		}
		else
		{
			throw new IllegalArgumentException("Bank name cannot be null or an empty string");
		}
	}
	
	//Method to an an Account
	public void addAccount(Account toadd)
	{
		if (toadd != null) 
		{
			accountObjects.put(toadd.getAccountNumber(), toadd);
		}
	}
	
	//Methid ti get account from an account number
	public Account getAccount(String accountNumber)
	{
		 Account account = null;
		 if(accountNumber == null) 
		 {
			 throw new IllegalArgumentException("Account number parameter cannot be null");
		 }
			Set<Map.Entry<String, Account>> accountObjectsSet = accountObjects.entrySet();
			
			for (Entry<String, Account> specificAccount : accountObjectsSet) 
			{
				if (specificAccount.getKey().equals(accountNumber))
				{
					account = specificAccount.getValue();
				}
				else
				{
					System.out.println("Cannot find the account number in the hashmap");
				}
			}
			return account;
	 }
	 
	//Method to show transactions for an account
	public void showTransactions(String name)
	{
		ArrayList<Account> listOfTransactions = new ArrayList<Account>();
		Set<Map.Entry<String, Account>> accountObjectsSet = accountObjects.entrySet();
		
		for (Entry<String, Account> specificAccount : accountObjectsSet) 
		{
			if (specificAccount.getValue().getCustomer().equals((name)))
			{
				listOfTransactions.add(specificAccount.getValue());
			}
			else 
			{
				throw new IllegalArgumentException("The customer with that name was not found in the collection");
			}
		}
		System.out.println("List of transactions for : "+name);
		System.out.println(listOfTransactions);
	}
	
	
	//Method to display account numbers
	public void displayAccountNumbers()
	{
		ArrayList<String> listOfAccountNumbers = new ArrayList<String>();
		Set<Map.Entry<String, Account>> accountObjectsSet = accountObjects.entrySet();
		
		for(Entry<String, Account> specificAccount : accountObjectsSet)
		{
			listOfAccountNumbers.add(specificAccount.getKey());
		}
		
		System.out.println("List of all account numbers: ");
		System.out.println(listOfAccountNumbers);
	}
	
	//Method to make a transaction
	public static void makeTransaction() {
		int day = DEFAULT_DAY;
		int month = DEFAULT_MONTH;
		int year = DEFAULT_YEAR;
		String quit = "";
		int index;
		TransactionRecord makeTransaction;
		
		do {
			System.out.println("Please provide an account number");
			if (input.hasNextInt()) 
			{
				Integer accountNumber = input.nextInt();
				input.nextLine();
				String accountNumberString = Integer.toString(accountNumber);

					if (accountObjects.containsKey(accountNumberString)) 
					{
						System.out.println("--------------------");
						System.out.println("1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Show Transactions");
						System.out.println("------------------");
					}
					else 
					{
						System.out.println("The account number was not found");
						break; 
					}
					
					
					if (input.hasNextInt())
					{
						
						Integer number = input.nextInt();
						if (number == ONE)
						
						{
							input.nextLine();
							double depositValue = 0.0;
							System.out.println("Enter a deposit amount");
							if (input.hasNextInt())
							{
								depositValue = input.nextInt();
							} 
							else
							{
								System.out.println("Please enter a valid deposit value");
							}
							accountObjects.get(accountNumberString).deposit(depositValue);
							System.out.println("New Balance: " + accountObjects.get(accountNumberString).getBalance());
							
							
							input.nextLine();
							System.out.println("Please provide a day between 1 and 31 inclusive");
							if (input.hasNextInt()) 
							{
								day = input.nextInt();
							}
							
							input.nextLine();
							System.out.println("Please provide a month between 1 and 12 inclusive");
							if (input.hasNextInt()) 
							{
								month = input.nextInt();
							} 
							
							
							input.nextLine();
							System.out.println("Please provide a year");
							if (input.hasNextInt()) 
							{
								year = input.nextInt();
							}
							
							Date date = new Date(day, month, year);
							accountObjects.get(accountNumberString).setDateAccountCreated(date);
							double balance = accountObjects.get(accountNumberString).getBalance();
							makeTransaction = new TransactionRecord(balance, date, accountNumberString, "DEPOSIT");							
							accountObjects.get(accountNumberString).addTransaction(makeTransaction);
						} 
						
						
						
						else if (number == TWO)
						{
							input.nextLine();
							double withdrawValue = 0.0;
							System.out.println("Enter a withdraw amount");
							if (input.hasNextInt())
							{
								withdrawValue = input.nextInt();
							} 
							else
							{
								System.out.println("Please enter a valid withdraw value");
							}
							
							accountObjects.get(accountNumberString).withdraw(withdrawValue);
							System.out.println("New Balance: " + accountObjects.get(accountNumberString).getBalance());
							

							input.nextLine();
							System.out.println("Please provide a day between 1 and 31 inclusive");
							if (input.hasNextInt()) 
							{
								day = input.nextInt();
							}
							
							input.nextLine();
							System.out.println("Please provide a month between 1 and 12 inclusive");
							if (input.hasNextInt()) 
							{
								month = input.nextInt();
							} 
							
							
							input.nextLine();
							System.out.println("Please provide a year");
							if (input.hasNextInt()) 
							{
								year = input.nextInt();
							}
							
							Date date = new Date(day, month, year);
							accountObjects.get(accountNumberString).setDateAccountCreated(date);
							double balance = accountObjects.get(accountNumberString).getBalance();

							makeTransaction = new TransactionRecord(balance, date, accountNumberString, "WITHDRAW");
							accountObjects.get(accountNumberString).addTransaction(makeTransaction);


						} 
						
						
						else if (number == THREE) 
						{
							String formattedName;
							
							System.out.println("Enter your name : ");
							if (input.hasNextInt()) 
							{
								System.out.println("Name cannot be an integer");
							} 
							else if (input.hasNextDouble()) {
								System.out.println("Name cannot be a double");
							} 
							else 
							{
								if (input.hasNext()) 
								{
									String name = input.next();
									formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
									
									if (accountObjects.get(accountNumberString).getCustomer().getName().equals(formattedName))
									{
										Set<Map.Entry<String, Account>> listOfTransactions = accountObjects.entrySet();
								
										for (Entry<String, Account> transactions : listOfTransactions) 
										{
							
										
											for (index = 0; index < transactions.getValue().getTransactionRecord().size(); index++)
												System.out.println("--------------------");
												System.out.println("Transaction: ");
												System.out.println("Amount: " + transactions.getValue().getTransactionRecord().get(index).getAmountInCad());
												System.out.println("Date: " + transactions.getValue().getTransactionRecord().get(index).getDateIssued().getDay() + "/" + transactions.getValue().getTransactionRecord().get(index).getDateIssued().getMonth() + "/" + transactions.getValue().getTransactionRecord().get(index).getDateIssued().getYear());
												System.out.println("--------------------");
											}
										}
									} 
									
									
									else 
									{
										System.out.println("name cannot be found");
									}
								}
							}
						
						else 
						{
							System.out.println("Please provide a valid response, either 1, 2 or 3");
						}
						
					}
											
				}
					
			System.out.println("DO another transaction? yes or no");
			quit = input.next();
			quit.toLowerCase();
		} 
		while (quit.equals("yes")); 
		System.out.println("Thank you for banking with us!");
		System.exit(0);
	}
}
