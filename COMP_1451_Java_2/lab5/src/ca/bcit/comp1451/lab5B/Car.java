package ca.bcit.comp1451.lab5B;

public class Car extends Vehicle
{
	//Instance Variables
	int horsePower;

	//Constructor for class Car
	public Car(int yearOfManufacturing, String make, String model, int horsePower)
	{
		super(yearOfManufacturing, make, model);
		setHorsePower(horsePower);
	}
	
	
	
	//Accesor Method for horsePower
	public int getHorsePower()
	{
		return horsePower;
	}

	//Mutator Method for Horsepower
	public void setHorsePower(int horsePower)
	{
		if(horsePower < 0)
		{
			System.out.println("Horsepower must be a positive value");
		}
		else 
		{
			this.horsePower = horsePower;
		}
	}
	
	//Display Details method 
	public void displayDetails()
	{
		System.out.println("Year of Manufacture:" + getYearOfManufacturing());
		System.out.println("Make:" + getMake());
		System.out.println("Model:" + getModel());
		System.out.println("Horsepower:" + getHorsePower());
	}
	

	
	
	
	
}
