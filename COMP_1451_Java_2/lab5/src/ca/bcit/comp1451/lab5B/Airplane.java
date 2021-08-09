package ca.bcit.comp1451.lab5B;

public class Airplane extends Vehicle
{
	//Instance Variables
	private int maxHeightInFeet;

	//Constructor for class Airplane
	public Airplane(int yearOfManufacturing, String make, String model, int maxHeightInFeet)
	{
		super(yearOfManufacturing, make, model);
		setMaxHeightInFeet(maxHeightInFeet);
	}
	
	//Accesor method for maxHeightInFeet
	public int getMaxHeightInFeet()
	{
		return maxHeightInFeet;
	}

	//Mutator method for maxHeightInFeet
	public void setMaxHeightInFeet(int maxHeightInFeet)
	{
		if (maxHeightInFeet < 0)
		{
			System.out.println("Max height in feet cannot be less than 0");
		}
		else
		{
			this.maxHeightInFeet = maxHeightInFeet;
		}

	}
	
	//Display Details Method
		public void displayDetails()
		{
			System.out.println("Year of Manufacture:" + getYearOfManufacturing());
			System.out.println("Make:" + getMake());
			System.out.println("Model:" + getModel());
			System.out.println("Max Height In Feet:" + getMaxHeightInFeet());
		}
	
	
	
	
}
