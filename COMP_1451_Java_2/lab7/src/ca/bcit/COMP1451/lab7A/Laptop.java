package ca.bcit.COMP1451.lab7A;

public class Laptop extends Computer
{
	//instance variables
	private double screenSize;
	
	//Constructor for class Laptop
	public Laptop(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeInGB, double screenSize)
	{
		super(brand, price, warrantyInMonths, cpuSpeed,memorySizeInGB);
		setScreenSize(screenSize);
	}

	//Get method for screenSize
	public double getScreenSize()
	{
		return screenSize;
	}

	//Set method for screenSize
	public void setScreenSize(double screenSize)
	{
		if (screenSize > 0)
		{
			this.screenSize = screenSize;
		}
		else
		{
			throw new IllegalArgumentException("Screen size must be a positive value");
		}
	}
	
	//Method to overrride toString method
	@Override 
	public String toString()
	{
		String s = super.toString();
		s = "Laptop " + s + ", Screen size: " + getScreenSize() + "\"";
		return s;
	}
}
