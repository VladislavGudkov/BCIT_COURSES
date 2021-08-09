package ca.bcit.comp1451.lab5B;

public class Boat extends Vehicle
{
	private boolean isMotorized;

	//Constructor for class Boat
	public Boat(int yearOfManufacturing, String make, String model, boolean isMotorized)
	{
		super(yearOfManufacturing, make, model);
		setIsMotorized(isMotorized);
	}


	//Accesor method for isMotorized
	public boolean getIsMotorized()
	{
		return isMotorized;
	}

	//Mutator method for isMotorized
	public void setIsMotorized(boolean isMotorized)
	{
		this.isMotorized = isMotorized;
	}
	
	//Display Details Method
	public void displayDetails()
	{
		System.out.println("Year of Manufacture:" + getYearOfManufacturing());
		System.out.println("Make:" + getMake());
		System.out.println("Model:" + getModel());
		System.out.println("Is Motorized Status:" + getIsMotorized());
	}
}
