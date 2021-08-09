package ca.bcit.comp1451.lab10B;

import java.util.Scanner;

public class Bank
{
	//instance variables
	Scanner scanner;
	BankAccount account;
	
	//constructor for class Bank
	public Bank(BankAccount account)
	{
		scanner = new Scanner(System.in);
		setAccount(account);
	}

	//get method for account
	public BankAccount getAccount()
	{
		return account;
	}

	//set method for account
	public void setAccount(BankAccount account)
	{
		if (account != null)
		{
			this.account = account;
		}
	}
	
	//proccess transaction method
	public void processTransaction() 
	{
		boolean checkValidity = true;
		String quitValue;
		
		while (checkValidity) 
		{
			System.out.println("Choose the transaction type:"  + "1. deposit"   + "2. withdraw"  + "3. display information");
			if (scanner.hasNextInt())
			{
				int numberSelection = scanner.nextInt();
				if (numberSelection == 1) 
				{
					System.out.println("How much would you like to deposit?");
					if (scanner.hasNextDouble()) 
					{
						double depositValue = scanner.nextInt();
						try 
						{
							account.deposit(depositValue);
						} 
						catch (NegativeAmountException e)
						{
							e.getMessage();
							e.printStackTrace();
						}
					} 
					
					else if (scanner.hasNextInt()) 
					{ 
						double depositValue = scanner.nextInt();
						try 
						{
							account.deposit(depositValue);
						}
						catch (NegativeAmountException e) 
						{
							e.getMessage();
							e.printStackTrace();
						}
					} 
					else
					{
						System.out.println("Please provide a valid response");
					}
				} 
				else if (numberSelection == 2)
				{
					System.out.println("How much would you like to withdrawal?");
					if (scanner.hasNextDouble())
					{
						double  withdrawValue = scanner.nextInt();
						try 
						{
							account.withdraw(withdrawValue);
						}
						catch (InsufficientFundException exception) 
						{
							exception.getMessage();
							exception.printStackTrace();
						}
					}  
					else if (scanner.hasNextInt()) 
					{ 
						double  withdrawValue = scanner.nextInt();
						try
						{
							account.withdraw(withdrawValue);
						}
						catch (InsufficientFundException e) 
						{
							e.getMessage();
							e.printStackTrace();
						}
					}  
					else
					{
						System.out.println("Please provide a valid response");
					}
				} 
				else if (numberSelection == 3) 
				{
					System.out.println("Account Holder: " + account.getName()  + "Account Balance: " + account.getBalance());
					
				}
				else 
				{
					System.out.println("Please provide a valid response");
				}
			} 
			else
			{
				System.out.println("Please provide a valid response");
			}
			
			System.out.println("Would you like to make another transaction? (Y/N)");
			quitValue = scanner.next();
			if (quitValue.equalsIgnoreCase("y"))
			{
				checkValidity = false;
				System.out.print("Thank you!");
				System.exit(0);
			}
		}
	}
	
}
