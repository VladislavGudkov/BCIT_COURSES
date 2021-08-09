package ca.bcit.COMP1451.lab7A;

public abstract class Electronics
{
	//instance variables
	private String brand;
	private double price;
	private int warrantyInMonths;
	
	//constructor for class Electronics
	public Electronics(String brand, double price, int warrantyInMonths)
	{
		setBrand(brand);
		setPrice(price);
		setWarrantyInMonths(warrantyInMonths);
	}

	//get method for band
	public String getBrand()
	{
		return brand;
	}

	//set method for band
	public void setBrand(String brand)
	{
		if(brand != null && !brand.isEmpty())
		{
		this.brand = brand;
		}
		else
		{
			throw new IllegalArgumentException("Brand name cannot not be null or an empty string");
		}
	}

	//get method for price
	public double getPrice()
	{
		return price;
	}

	//set method for price
	public void setPrice(double price)
	{
		if( price > 0)
		{
		this.price = price;
		}
		else
		{
			throw new IllegalArgumentException("Price must be a positive value");
		}
	}

	//get method for warrantyInMonths
	public int getWarrantyInMonths()
	{
		return warrantyInMonths;
	}

	//set method for warrantyInMonths
	public void setWarrantyInMonths(int warrantyInMonths)
	{
		if(warrantyInMonths > 0)
		{
		this.warrantyInMonths = warrantyInMonths;
		}
		else
		{
			throw new IllegalArgumentException("warrantyInMonths must be a positive value");
		}
	}
	
	//abstract method for increasePrice
	public abstract void increasePrice (double percentage);
	
	//Method for toString Override
	@Override 
	public String toString()
	{
		String s;
		s = "Brand: " + getBrand() +", Price: " + getPrice() + ",Warranty: "  + getWarrantyInMonths() + "Months ,";
		return s;
	}	
}
