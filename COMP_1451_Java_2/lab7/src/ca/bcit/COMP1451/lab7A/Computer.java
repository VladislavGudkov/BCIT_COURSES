package ca.bcit.COMP1451.lab7A;

public class Computer extends Electronics
{
	//instance variables
	private int cpuSpeed;
	private int memorySizeInGB;
	
	//Constructor for Class Computer
	public Computer(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeInGB)
	{
		super(brand, price,warrantyInMonths);
		setCpuSpeed(cpuSpeed);
		setMemorySizeInGB(memorySizeInGB);
	}
	
	//Get method for cpuSpeed
	public int getCpuSpeed()
	{
		return cpuSpeed;
	}
	
	//Set method for cpuSpeed
	public void setCpuSpeed(int cpuSpeed)
	{
		if (cpuSpeed > 0)
		{
			this.cpuSpeed = cpuSpeed;
		}
		else
		{
			throw new IllegalArgumentException("CPU speed must be a positive value");
		}
	}
	
	//Get method for memorySizeInGB
	public int getMemorySizeInGB()
	{
		return memorySizeInGB;
	}
	
	//Set method for memorySizeInGB
	public void setMemorySizeInGB(int memorySizeInGB)
	{
		if(memorySizeInGB > 0 )
		{
			this.memorySizeInGB = memorySizeInGB;
		}
		else
		{
			throw new IllegalArgumentException("Memory size must be a positive value");
		}
		
	}
	
	//Method for toString override
	@Override 
	public String toString()
	{
		String s = super.toString();
		s = "Computer " + s + " cpu speed: " +getCpuSpeed() +"Mhz" + " , Memory size in GB: " + getMemorySizeInGB()+"GB";
		return s;
	}
	
	//increasePrice method
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
			
			warrantyIncrease = warrantyIncrease + 12;
			setWarrantyInMonths(warrantyIncrease);	
		}
		else 
		{
			throw new IllegalArgumentException("percentage must be a positive value");
		}
	}		

	
	
}
