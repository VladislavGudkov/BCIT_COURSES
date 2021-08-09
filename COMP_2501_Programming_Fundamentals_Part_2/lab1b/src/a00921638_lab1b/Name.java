package a00921638_lab1b;
/**
 * @author Vladislav Gudkov (A009
 */


public class Name 
{
	//instance variables
	private String first;
	private String last;
	
	//constructor for name
	public Name(String first, String last)
	{
		this.first = first;
		this.last = last;
	}
	
	//getter for first name
	public String getFirst() 
	{
		return first;
	}
	
	//setter for first name
	public void setFirst(String first) 
	{
		this.first = first;
	}
	
	//getter for last name
	public String getLast() 
	{
		return last;
	}
	
	//setter for last name
	public void setLast(String last)
	{
		this.last = last;
	}
	
	//getFullName method
	public String getFullName()
	{
		return first + " " + last;
	}
	
	//getInitials method
	public String getInitials()
	{
		return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0)+".";
	}
}
