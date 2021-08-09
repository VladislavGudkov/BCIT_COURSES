/**
 * @author Vladislav GUdkov(A00921638)
 */

public class Residence extends Property
{
	//Symbolic Constants
	public static final int MIN_NUM_BEDROOMS = 1;
	
	//Instance Variables
	private int numberOfBedrooms;
	private boolean swimmingPool;
	private boolean strata;
	
	

	public Residence(String propertyId, String type, double priceUsd, Address address, int numberOfBedrooms, boolean swimmingPool, boolean strata) 
	{
		super(propertyId, type, priceUsd, address);
		
		if(numberOfBedrooms < MIN_NUM_BEDROOMS )
		{
			throw new IllegalArgumentException("Invalid number of bedrooms: "+numberOfBedrooms);
		}
		else
		{
			this.numberOfBedrooms = numberOfBedrooms;
		}
		
		this.swimmingPool = swimmingPool;
		this.strata = strata;
	}

	
	
	//Get Methods

	public int getNumberOfBedrooms() 
	{
		return numberOfBedrooms;
	}



	public boolean hasSwimmingPool() 
	{
		return swimmingPool;
	}



	public boolean hasStrata() 
	{
		return strata;
	}



	@Override
	public String toString() {
		return "Residence [numberOfBedrooms=" + numberOfBedrooms + ", swimmingPool=" + swimmingPool + ", strata="
				+ strata + "]";
	}

	
}
