package a00921638_assignment1;

/**
 * 
 * @author Vladislav Gudkov (A00921638)
 *
 */


public class Address 
{
	//instance variables
	private String unitNumber;
	private int streetNumber;
	private String streetName;
	private String postalCode;
	private String city;
	
	//Constants
	private static final int MAX_STREET_NUMBER = 999999;
	private static final int FOUR = 4;
	private static final int FIVE = 5;
	private static final int SIX = 6;
	private static final int TWENTY = 20;
	private static final int THIRTY = 30;
	private static final int ONE = 1;
	private static final int ZERO = 0;
	
	//Constructor
	public Address(String unitNumber, int streetNumber, String streetName, String postalCode, String city)
	{
		if(unitNumber == null) 
		{
			 this.unitNumber = null;
		}
		else if(unitNumber.length() > ONE && unitNumber.length() > FOUR)
		{
			throw new IllegalArgumentException("Invalid unit number: ");
		}
		else
		{
			this.unitNumber = unitNumber;
		}
		
		if(streetNumber < 0 && streetNumber > MAX_STREET_NUMBER )
		{
			throw new IllegalArgumentException("Invalid street number: ");
		}
		else
		{
			this.streetNumber = streetNumber;
		}
		
		if(streetName.length() < ONE && streetName.length() > TWENTY )
		{
			throw new IllegalArgumentException("Invalid street name: ");
		}
		else
		{
			this.streetName = streetName;
		}
		
		if(postalCode.length() < FIVE && postalCode.length() > SIX )
		{
			throw new IllegalArgumentException("Invalid postal code: ");
		}
		else
		{
			this.postalCode = postalCode;
		}
		
		if(city.length() < ONE && city.length() > THIRTY )
		{
			throw new IllegalArgumentException("Invalid city: ");
		}
		else
		{
			this.city = city;
		}
		
		
	}

	//Get methods for instance variables
	public String getUnitNumber() 
	{
		return unitNumber;
	}
	
	public int getStreetNumber() 
	{
		return streetNumber;
	}

	public String getStreetName() 
	{
		return streetName;
	}

	public String getPostalCode() 
	{
		return postalCode;
	}

	public String getCity() 
	{
		return city;
	}
	
	
}
