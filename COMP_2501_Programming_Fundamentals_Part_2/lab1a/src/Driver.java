/**
 * @author Vladislav Gudkov(A00921638)
 */

//Driver Class
public class Driver 
{
	//main method
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount(100.00, "abc123", "gates");
		BankAccount b2 = new BankAccount(500.00, "xyz789", "woods");
		
		System.out.println(b1.getBalanceCdn());
		b1.withdraw(5.00);
		System.out.println(b1.getAccountNumber());
		System.out.println(b1.getBalanceCdn());
		
		System.out.println("---");
		
		System.out.println(b2.getBalanceCdn());
		b2.deposit(23.00);
		System.out.println(b2.getLastName());
		System.out.println(b2.getBalanceCdn());
		
		System.out.println("---");
		
		b1.transfer(50.00, b2);
		System.out.println(b1.getBalanceCdn());
		System.out.println(b2.getBalanceCdn());
	}	
}
