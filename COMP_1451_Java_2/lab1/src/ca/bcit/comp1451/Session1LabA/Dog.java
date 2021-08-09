/**
 * 
 */
package ca.bcit.comp1451.Session1LabA;

/**
 * @author Vlad Gudkov (A00921638)
 *
 */
public class Dog
{
	//instance variables
	private String name;
	private String breed;
	private int ageInYears;
	
	
	
	/**
	 * no args Constructor
	 */
	public Dog(String name, String breed, int ageInYears)
	{
		setName(name);
		setBreed(breed);
		setAgeInYears(ageInYears);
	}


	//Get method for name
	public String getName()
	{
		return name;
	}


	//Set method for name
	public void setName(String name)
	{
		if(name != null)
		{
			this.name = name;
		}
		else
		{
		 throw new IllegalArgumentException("name cannot be null or an empty String");
		}
		
	}


	//Get method for breed
	public String getBreed()
	{
		return breed;
	}

	//Set method for breed
	public void setBreed(String breed)
	{
		if(breed != null)
		{
			this.breed = breed;
		}
		else
		{
		 throw new IllegalArgumentException("breed cannot be null or an empty String");
		}
	}


	//get Method for ageInYears
	public int getAgeInYears()
	{
		return ageInYears;
	}

	//Set method for ageInYears
	public void setAgeInYears(int ageInYears)
	{
		if(ageInYears >= 0)
		{
		this.ageInYears = ageInYears;
		}
		else
		{
			throw new IllegalArgumentException("age cannot be 0 or less");
		}
	}
	
	//Display details method for name, breed and AgeInYears
	public void displayDetails()
	{
		System.out.println("Dog name is : " + name);
		System.out.println("Breed name is : " + breed);
		System.out.println("Dog age is : " + ageInYears);
	}
	
	
	
	
	
	
	
	
	
	
	

}
