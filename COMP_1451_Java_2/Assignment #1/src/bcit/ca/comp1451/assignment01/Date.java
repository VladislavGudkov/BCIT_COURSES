package bcit.ca.comp1451.assignment01;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;
/**
 * @author Vladislav Gudkov (A00921638)
 */

public class Date
{
	//Instance Variables
	private int day;
	private int month;
	private int year;
	private HashMap <Integer, String> months;
	
	//Symbolic constants
	public static final int FIRST_DAY_OF_MONTH = 1;
	public static final int LAST_DAY_OF_MONTH = 31;
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int MINIMUM_YEAR = 1900;
	public static final int CURRENT_YEAR = 2020;
	
	public static final String STRING_ZERO = "0";
	public static final int FORMATTED_ZERO_LIMIT = 10;
	
	
	
	//Constructor for class Date
	public Date(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
		months = new HashMap<Integer, String> ();
		populateMonths();
	}
	
	
	
	//Getter method for day
	/**
	 * @return day
	 */
	public int getDay()
	{
		return day;
	}
	
	//Mutator method for day
	/**
	 * @param day
	 */
	public void setDay(int day)
	{
		if(day >= FIRST_DAY_OF_MONTH && day <= LAST_DAY_OF_MONTH)
		{
			this.day = day;
		
		}
		else
		{
			this.day = FIRST_DAY_OF_MONTH;
		}
		
	}
	
	//Getter method for month
	public int getMonth()
	{
		return month;
	}
	
	//Mutator method for month
	public void setMonth(int month)
	{
		if(month >= FIRST_MONTH && month <= LAST_MONTH)
		{
			this.month = month;
			
		}
		else
		{
			this.month = FIRST_MONTH;
		}
	}
	
	//Getter method for year
	public int getYear()
	{
		return year;
	}
	
	//Mutator method for year
	public void setYear(int year)
	{
		if(month >= MINIMUM_YEAR && month <= CURRENT_YEAR)
		{
			this.year = year;
		}
		else
		{
			this.year = MINIMUM_YEAR;
		}
	}
	
	//Method to populate months HashMap with the values key, value pairs below
	private void populateMonths()
	{	
		months.put(1, "January");
		months.put(2, "February");
		months.put(3, "March");
		months.put(4, "April");
		months.put(5, "May");
		months.put(6, "June");
		months.put(7, "July");
		months.put(8, "August");
		months.put(9, "September");
		months.put(10, "October");
		months.put(11, "November");
		months.put(12, "December");
	}
	
	//Method to format the date to a sting dd/mm/yyyy where mm is a String for the month name
	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return formattedDate
	 */
	public String dateFormat(int day, int month, int year)
	{
		//Local variables
		String dayFormat;
		String monthName;
		String formattedDate;

		if (day > 0 && day < FORMATTED_ZERO_LIMIT)
		{
			this.day = day;
			dayFormat = Integer.toString(day);
			dayFormat = STRING_ZERO + day;
		}
		
		else
		{
			this.day = day;
			dayFormat = Integer.toString(day);
		}
		
		Set<Map.Entry<Integer, String>> monthSet = months.entrySet();
		for (Entry<Integer, String> monthNames : monthSet)
		{
			if (monthNames.getKey().equals(month)) 
			{
				monthName = monthNames.getValue();
			}
		}
		
		formattedDate = dayFormat + "/" + months + "/" + year;
		return formattedDate;	
	}	
}
