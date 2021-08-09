package ca.bcit.COMP1451.lab7B;

public class SalesEmployee extends Employee
{
	//Instance variables
	private int numberOfsoldUnits;
	private double comissionRatePerUnit;
	
	//Constructor for class SalesEmployee
	public SalesEmployee(String name, int numberOfsoldUnits, double comissionRatePerUnit)
	{
		super(name);
		setNumberOfsoldUnits(numberOfsoldUnits);
		setComissionRatePerUnit(comissionRatePerUnit);
	}
	
	//Get method for numberOfsoldUnits
	public int getNumberOfsoldUnits()
	{
		return numberOfsoldUnits;
	}

	//Set method for numberOfsoldUnits 
	public void setNumberOfsoldUnits(int numberOfsoldUnits)
	{
		if (numberOfsoldUnits > 0)
		{
			this.numberOfsoldUnits = numberOfsoldUnits;	
		}
		else
		{
			throw new IllegalArgumentException("Number of units sold be must a positive number");
		}
		
	}

	//Get method for comissionRatePerUnit
	public double getComissionRatePerUnit()
	{
		return comissionRatePerUnit;
	}

	//Set method for comissionRatePerUnit
	public void setComissionRatePerUnit(double comissionRatePerUnit)
	{
		if (comissionRatePerUnit > 0)
		{
			this.comissionRatePerUnit = comissionRatePerUnit;	
		}
		else
		{
			throw new IllegalArgumentException("commision rate per unit be must a positive number");
		}
	}
	
	

	//method to calculate pay
	@Override
	public double calculatePay()
	{
		double pay;
		int unitsSold = getNumberOfsoldUnits();
		double commisionPerUnit = getComissionRatePerUnit();
		pay = unitsSold * commisionPerUnit;
		return pay;
	}
	
	
	//method to override toString method
		@Override
		public String toString()
		{
			String s = super.toString();
			s = s + " and they are a sales employee. Their total units sold is: " + getNumberOfsoldUnits() + " , and their commision rate per unit is: " +getComissionRatePerUnit() + ". Their total pay is: " + calculatePay() ;
		 return s;
		}
		
		
	
	
	
	
}
