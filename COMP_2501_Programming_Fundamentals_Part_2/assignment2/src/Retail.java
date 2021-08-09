/**
 * @author Vladislav GUdkov(A00921638)
 */
public class Retail extends Property
{
	//Instance Variables
	private int squareFootage;
	private boolean customerParking;
	
	
	

	public Retail(String propertyId, String type, double priceUsd, Address address, int squareFootage, boolean customerParking) 
	{
		super(propertyId, type, priceUsd, address);
		this.squareFootage = squareFootage;
		this.customerParking = customerParking;

	}


	//Get Methods

	public int getSquareFootage() 
	{
		return squareFootage;
	}


	public boolean isCustomerParking() 
	{
		return customerParking;
	}


	@Override
	public String toString() {
		return "Retail [squareFootage=" + squareFootage + ", customerParking=" + customerParking + "]";
	}
	
	
	

}
