package a00921638_assignment1;

/**
 * 
 * @author Vladislav Gudkov (A00921638)
 *
 */

public class Property 
{
	//instance variables
	private String propertyID;
	private String type;
	private double PriceUsd;
	private Address address;
	private int numberOfBedrooms;
	private boolean swimmingPool;
	
	//Constants
	private static final int SIX = 6;
	private static final int ONE = 1;
	private static final int TWENTY = 20;
	private static final int ZERO = 0;
	
	//constructor
	public Property(String propertyID, String type, double PriceUsd, Address address, int numberOfBedrooms, boolean swimmingPool)
	{
		if(propertyID.length() < ONE || propertyID.length() > SIX)
		{
			throw new IllegalArgumentException("Invalid property id: "+propertyID);
		}
		else
		{
			this.propertyID = propertyID;
		}
		
		if(type.equalsIgnoreCase("residence") || type.equalsIgnoreCase("commercial") || type.equalsIgnoreCase("retail"))
		{
			this.type = type;
		}
		else
		{
			throw new IllegalArgumentException("Invalid property type: "+type);
		}
		
		if(PriceUsd < ZERO)
		{
			throw new IllegalArgumentException("Invalid price: "+PriceUsd);
		}
		else
		{
			this.PriceUsd = PriceUsd;	
		}
		
		if(address == null)
		{
			throw new IllegalArgumentException("Invalid address: "+address);
		}
		else
		{
			this.address = address;
		}
		
		if(numberOfBedrooms < ONE && numberOfBedrooms > TWENTY)
		{
			throw new IllegalArgumentException("Invalid number of bedrooms: "+numberOfBedrooms);
		}
		else
		{
			this.numberOfBedrooms = numberOfBedrooms;
		}
		
		this.swimmingPool = swimmingPool;
	}

	//Set Method
	public void setPriceUsd(double PriceUsd) 
	{
		if(PriceUsd < ZERO)
		{
			throw new IllegalArgumentException("Invalid price: ");
		}
		else
		{
			this.PriceUsd = PriceUsd;	
		}
	}
	
	//Print details method
	public String getPropertyDetails()
	{
		return "";
	}
	
	
	//Get methods
	public double getPriceUsd() 
	{
		return PriceUsd;
	}

	public String getPropertyId() 
	{
		return propertyID;
	}

	public String getType() 
	{
		return type;
	}

	public Address getAddress() {
		
		return address;
	}

	public int getNumberOfBedrooms() 
	{
		return numberOfBedrooms;
	}

	public boolean hasSwimmingPool() 
	{
		return swimmingPool;
	}
	
	
	

}
