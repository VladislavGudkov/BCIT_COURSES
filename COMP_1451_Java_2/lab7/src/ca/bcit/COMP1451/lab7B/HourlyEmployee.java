package ca.bcit.COMP1451.lab7B;

public class HourlyEmployee extends Employee
{
	//Instance variables
	private int  numberOfHours;
	private double payRate;
	
	//Constructor for class HourlyEmployee
	public HourlyEmployee(String name, int numberOfHours, double payRate)
	{
		super(name);
		setNumberOfHours(numberOfHours);
		setPayRate(payRate);
	}
	
	//Get method for numberofHours
	public int getNumberOfHours()
	{
		return numberOfHours;
	}

	//Set method for numberOfHours
	public void setNumberOfHours(int numberOfHours)
	{
		if(numberOfHours > 0)
		{
			this.numberOfHours = numberOfHours;
		}
		else
		{
			throw new IllegalArgumentException("Number of hours must be positive");
		}
	}

	//Get method for payRate
	public double getPayRate()
	{
		return payRate;
	}

	//Set method for payRate
	public void setPayRate(double payRate)
	{
		if(payRate > 0)
		{
			this.payRate = payRate;
		}
		else
		{
			throw new IllegalArgumentException("Pay rate must be positive");
		}
	}
	
	//method to calculate pay
	@Override
	public double calculatePay()
	{
		double pay;
		int hoursWorked = getNumberOfHours();
		double hourlyWage = getPayRate();
		pay = hoursWorked * hourlyWage;
		return pay;
	}
		
	//method to override toString method
	@Override
	public String toString()
	{
		String s = super.toString();
		s = s + " and they are an hourly employee. Their hourly rate is " + getPayRate() + " , and their hours worked is: " +getNumberOfHours() + ". Their total pay is: " + calculatePay() ;
		return s;
	}
}
