package ca.bcit.comp1451.lab6A;

public class Person
{
	//Instance variables
	private String name;
	private int ageInYears;
	
	//Constructor for class Person
	public Person(String name, int ageInYears)
	{
		setName(name);
		setAgeInYears(ageInYears);
	}
	
	
	
	//Getter method for name
	public String getName()
	{
		return name;
	}
	
	//Setter method for name
	public void setName(String name)
	{
		if(name != null && !name.isEmpty())
		{
			this.name = name;
		}
		else 
		{
			throw new IllegalArgumentException("Name cannot be null or an empty string");
		}
		
	}
	
	//Getter method for ageInYears
	public int getAgeInYears()
	{
		return ageInYears;
	}
	
	//Setter method for ageInYears
	public void setAgeInYears(int ageInYears)
	{
		if (ageInYears > 0 && ageInYears <= 130)
		{
			this.ageInYears = ageInYears;
		}
		else
		{
			throw new IllegalArgumentException("Age cannot be negative or greater than 130");
		}
		
	}
	
	//To string method
	@Override
	public String toString() 
	{
		String s = "Name is " + getName() + ", the age is " + getAgeInYears() + " years";	
		return s;
	}
	
	//override equals method
	@Override
	public boolean equals(Object object) {
		boolean value = true;
		Person a = (Person) object;
		
		if (this == object) 
		{
			return value;
		} 
		
		if (object == null) 
		{
			value = false;
		}
		
		if (!(object instanceof Person))
		{
			value = false;
		}
		
		
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
		return value;
	}
	
	

}
