package bcit.ca.comp1451.assignment01;
/**
 * @author Vladislav Gudkov (A00921638)
 */
public class Customer
{
	//Instance variables
	private String name;
	private String address;
	private Date dateOfBirth;
	
	//Constructor for class Customer
	public Customer(String name, String address, Date dateOfBirth) 
	{
		setName(name);
		setAddress(address);
		setDateOfBirth(dateOfBirth);
	}
	
	//Getter method for name
	public String getName()
	{
		return name;
	}
	
	//Mutator method for name
	public void setName(String name)
	{
		if(name != null && !name.isEmpty())
		{
			this.name = name;
		}
		else
		{
			System.out.println("Name cannot be null or an empty string");
		}
	}
	
	//Getter method for address
	public String getAddress()
	{
		return address;
	}
	
	//Mutator method for address
	public void setAddress(String address)
	{
		if(address != null && !address.isEmpty())
		{
			this.address = address;
		}
		else
		{
			System.out.println("Address cannot be null or an empty string");
		}
	}
	
	//Getter method for date of birth
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	//Mutator method for date of birth
	public void setDateOfBirth(Date dateOfBirth) 
	{
		if (dateOfBirth != null) 
		{
			this.dateOfBirth = dateOfBirth;
		} 
		else 
		{
			throw new IllegalArgumentException("Please provide a valid date of birth");
		}
	}
	
	//Method to format name
	public String formatName(String word) {
		String formattedName = "";
		if(word != null) {
		 formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return formattedName;
	}
	
	
	//Display Details Method for Customer
	public void displayDetails() {
		System.out.println("Customer Name: " + getName());
		System.out.println("Customer Address: " + getAddress());
		System.out.println("Customer Date of Birth: " + getDateOfBirth());
	}
	
	
}
