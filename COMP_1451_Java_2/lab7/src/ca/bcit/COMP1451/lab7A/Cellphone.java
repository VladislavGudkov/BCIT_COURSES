package ca.bcit.COMP1451.lab7A;

public class Cellphone extends Electronics
{

	//instance variables
	private double batteryLifeTime;
	
	public Cellphone(String brand, double price, int warrantyInMonths, double batteryLifeTime)
	{
		super(brand, price, warrantyInMonths);
		setBatteryLifeTime(batteryLifeTime);
	}

	
	//get method for batteryLifeTime 
	public double getBatteryLifeTime()
	{
		return batteryLifeTime;
	}

	//set method for batteryLifeTime 
	public void setBatteryLifeTime(double batteryLifeTime)
	{
		if(batteryLifeTime  >= 0)
		{
			this.batteryLifeTime = batteryLifeTime;
		}
		else
		{
			throw new IllegalArgumentException("Battery life must be a positive value");
		}
		
	}
	
	//Override for method toString
	@Override
	public String toString()
	{
		String s = super.toString();
		s = "Cellphone " + s + "Battery life time: " + getBatteryLifeTime() +"Hr";
		return s;
	}
	
	//Increase price method
	@Override
	public void increasePrice (double percentage)
	{
		double percentageValue;
		double price  = getPrice();
		int warrantyIncrease = getWarrantyInMonths();
		
		if (percentage > 0) 
		{
			percentage = percentage / 100;
			
			percentageValue = price * percentage;
			price = price + percentageValue;
			setPrice(price);
			
			warrantyIncrease = warrantyIncrease + 6;
			setWarrantyInMonths(warrantyIncrease);	
		}
		else 
		{
			throw new IllegalArgumentException("Percentage must be a positive value");
		}
	}		
}



