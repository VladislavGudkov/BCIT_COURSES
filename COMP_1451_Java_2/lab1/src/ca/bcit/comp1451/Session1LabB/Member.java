/**
 * 
 */
package ca.bcit.comp1451.Session1LabB;

/**
 *@author Vlad Gudkov (A00921638)
 *
 */
public class Member
{
	//instance variables
	private String firstName;
	private String lastName;
	private int monthOfJoining;
	private int yearOfJoining;
	
	//constants declaration
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2019;
	
	//Constructor for class Member
	/**
	 * @param firstName
	 * @param lastName
	 * @param monthOfJoining
	 * @param yearOfJoining
	 */
	public Member(String firstName, String lastName, int monthOfJoining, int yearOfJoining)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setMonthOfJoining(monthOfJoining);
		setYearOfJoining(yearOfJoining);
	}
	
	//Get method for variable firstName
	public String getFirstName()
	{
		return firstName;
	}
	
	//Set method for variable firstName
	public void setFirstName(String firstName)
	{
		if(firstName != null && !firstName.isEmpty())
		{
			this.firstName = firstName;
		}
		else
		{
			throw new IllegalArgumentException("First name cannot be null or an empty string");
		}
	}
	
	//Set method for variable lastName
	public String getLastName()
	{
		return lastName;
	}
	
	//Set method for variable lastName
	public void setLastName(String lastName)
	{
		if(lastName != null && !lastName.isEmpty())
		{
			this.lastName = lastName;
		}
		else
		{
			throw new IllegalArgumentException("lastName cannot be null or an empty string");
		}
	}
	
	//get method for variable monthOfJoining
	public int getMonthOfJoining()
	{
		return monthOfJoining;
	}
	
	//Set method for variable monthOfJoining
	public void setMonthOfJoining(int monthOfJoining)
	{
		if (monthOfJoining >= FIRST_MONTH && monthOfJoining <= LAST_MONTH)
		{
			this.monthOfJoining = monthOfJoining;
		}
		else 
		{
			throw new IllegalArgumentException("Month of joinging must be between months 1 and 12 inclusive");
		}
	}
	
	//get method for variable yearOfJoining
	public int getYearOfJoining()
	{
		return yearOfJoining;
	}
	
	//set method for variable yearOfJoining
	public void setYearOfJoining(int yearOfJoining)
	{
		if (yearOfJoining >= 0 && yearOfJoining <= CURRENT_YEAR)
		{
			this.yearOfJoining = yearOfJoining;
		}
	}

	
}
