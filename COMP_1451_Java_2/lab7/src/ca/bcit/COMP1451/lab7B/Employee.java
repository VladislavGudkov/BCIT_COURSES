package ca.bcit.COMP1451.lab7B;

public abstract class Employee
{
	//instance variables
	private String name;
	
	//constructor for class Employee
	public Employee(String name)
	{
		setName(name);
	}

	//get method for name
	public String getName()
	{
		return name;
	}

	//set method for name
	public void setName(String name)
	{
		if(name != null && !name.isEmpty())
		{
			this.name = name;
		}
		
		else
		{
			throw new IllegalArgumentException("Name cannot not be null or an empty string");
		}
	}
	
	
	//method to override toString method
	@Override
	public String toString()
	{
	 String s = "The employee name is: " + getName();
	 return s;
	}
	
	
	//declaration of abstract method calculatePay
	public abstract double calculatePay();
	
	
}
