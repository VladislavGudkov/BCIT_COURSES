package ca.bcit.comp1451.lab10A;

public class NumberReader
{
	//inputSum method
	public int inputSum() throws InvalidInputException 
	{
		InputReader input = new InputReader();
		int sum = 0;
		boolean checkValidity = true;
		
		try 
		{
			//loop to run until input no longer valid (not an integer)
			while (checkValidity)
			{
				System.out.println("Please provide an number.");
				int value = input.getNumber();
				
				if (value != 0) 
				{
					sum = sum + value;
				} 
				else 
				{
					checkValidity = false;
				}
			}

		} 
		catch (InvalidInputException exception) 
		{
			exception.getMessage();
			exception.printStackTrace();
		} 
		catch (Exception exception) 
		{
			exception.getMessage();
		}

		return sum;
		
	}
	
	
	//Main method
public static void main(String[] args) 
	{
		

		NumberReader read = new NumberReader();
		
		try 
		{
			read.inputSum();
		} 
		catch (InvalidInputException exception) 
		{
			exception.getMessage();
		}

	}
	
	
}
