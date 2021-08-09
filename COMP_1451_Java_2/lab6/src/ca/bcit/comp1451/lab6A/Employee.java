package ca.bcit.comp1451.lab6A;

public class Employee extends Person
{
	//Instance variables
	private double hourlyRate;
	private int numberOfWorkingHoursPerWeek;
	
	//Constructor for class Employee
	public Employee(String name, int ageInYears, double hourlyRate, int numberOfWorkingHoursPerWeek)
	{
		super(name, ageInYears);
		setHourlyRate(hourlyRate);
		setNumberOfWorkingHoursPerWeek(numberOfWorkingHoursPerWeek);
	}
	
	//Getter method for hourlyRate
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	//Setter method for hourlyRate
	public void setHourlyRate(double hourlyRate)
	{
		if(hourlyRate > 0)
		{
			this.hourlyRate = hourlyRate;
		}
		else
		{
			throw new IllegalArgumentException("Hourly rate must be a positive value");
		}
		
	}
	
	//Getter method for numberOfWorkingHoursPerWeek
	public int getNumberOfWorkingHoursPerWeek()
	{
		return numberOfWorkingHoursPerWeek;
	}

	//Setter method for numberOfWorkingHoursPerWeek
	public void setNumberOfWorkingHoursPerWeek(int numberOfWorkingHoursPerWeek)
	{
		if(numberOfWorkingHoursPerWeek > 0 && numberOfWorkingHoursPerWeek <= 80)
		{
			this.numberOfWorkingHoursPerWeek = numberOfWorkingHoursPerWeek;
		}
		else
		{
			throw new IllegalArgumentException("Number of working hours per week must be positive and less than or equal to 80");
		}
		
	}
	
	@Override
	public String toString() 
	{
		String s;
		if (numberOfWorkingHoursPerWeek > 0 && numberOfWorkingHoursPerWeek <= 40)
		{
			s = "This Employee's name is " + getName() + " and the age is " + getAgeInYears() +  " years old. This is a part time employee";	
		}
		else
		{
			s = "This Employee's name is " + getName() + " and the age is " + getAgeInYears() +  " years old. This is a full time employee";
		}
		return s;
	}
	
	
	//Equals method overrride
	@Override
	public boolean equals(Object object) 
	{
		boolean value = true;
		if (this == object)
		{
			return value;
		} 
		
		if (object == null) 
		{
			value = false;
		}
		
		if (!(object instanceof Employee))
		{
			value = false;
		}
		
		Employee a = (Employee) object;
		if (getName() == null) 
		{
			if (a.getName() != null) 
			{
				value = false;
			}
		}
		else if (!getName().equals(a.getName()) )
		{
			value = false;
		} 
		else if (!(getHourlyRate() == a.getHourlyRate())) 
		{
			value = false;
		}
		return value;
		
	}

	
	
	
}
