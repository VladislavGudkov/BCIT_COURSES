package ca.bcit.comp1451.lab5B;

public class Vehicle
{
	//Instance Variables
	private int yearOfManufacturing;
	private String make;
	private String model;
	
	//Constructor for class Vehicle
	public Vehicle(int yearOfManufacturing, String make, String model)
	{
		setYearOfManufacturing(yearOfManufacturing);
		setMake(make);
		setModel(model);
		
	}
	
	
	//Accesor method for yearOfManufacturing
	public int getYearOfManufacturing()
	{
		return yearOfManufacturing;
	}
	
	//Mutator method for yearOfManufacturing
	public void setYearOfManufacturing(int yearOfManufacturing)
	{
		if(yearOfManufacturing < 0)
		{
			System.out.println("Year of manufacturing must be positive");
		}
		else
		{
			this.yearOfManufacturing = yearOfManufacturing;
		}
	}
	
	//Accesor method for make
	public String getMake()
	{
		return make;
	}
	
	//Mutator method for make
	public void setMake(String make)
	{
		if (make != null && !make.isEmpty())
		{
			this.make = make;
		}
		else
		{
			this.make = "unknown";
		}
	}
	
	//Accesor method for model
	public String getModel()
	{
		return model;
	}
	
	//Mutator method for model
	public void setModel(String model)
	{
		if (model != null && !model.isEmpty())
		{
			this.model = model;
		}
		else
		{
			this.model = "unknown";
		}
	}
	
	
}
