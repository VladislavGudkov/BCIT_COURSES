package ca.bcit.comp1451.lab8A;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Date implements Displayable
{

	//instance variables
	private int day;
	private int month;
	private int year;
	
	//Symbolic constants
	private static final int START_DAY = 1;
	private static final int END_DAY = 31;
	private static final int START_MONTH = 1;
	private static final int END_MONTH = 12;
	private static final int START_YEAR = 1900;
	private static final int END_YEAR = 2020; //current year as of writing this code
	private static final int END_DIGIT = 10;
	private static final String LEADING_ZERO = "0";
	
	public HashMap<Integer, String> monthNames;
	
	//Constructor for Date class
	public Date(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
		//populateMonths();
	}
	
	
	//Get method for day
	public int getDay()
	{
		return day;
	}

	//Set method for day
	public void setDay(int day)
	{
		if(day >= START_DAY && day <= END_DAY)
		{
			this.day = day;
		}
		else 
		{
			this.day = START_DAY;
		}
		
	}

	//Get method for month
	public int getMonth()
	{
		return month;
	}

	//Set method for month
	public void setMonth(int month)
	{
		if(month >= START_MONTH && month <= END_MONTH)
		{
			this.month = month;
		}
		else 
		{
			this.month = START_MONTH;
		}
	}


	//Get method for year
	public int getYear()
	{
		return year;
	}


	//Set method for year
	public void setYear(int year)
	{
		if(year >= START_YEAR && year <= END_YEAR)
		{
			this.year = year;
		}
		else 
		{
			this.year = START_YEAR;
		}
	}
	
	
	//hashmap for month names
	public void populateMonths() 
	{
		monthNames.put(1, "January");
		monthNames.put(2, "Febuary");
		monthNames.put(3, "March");
		monthNames.put(4, "April");
		monthNames.put(5, "May");
		monthNames.put(6, "June");
		monthNames.put(7, "July");
		monthNames.put(8, "August");
		monthNames.put(9, "September");
		monthNames.put(10, "October");
		monthNames.put(11, "November");
		monthNames.put(12, "December");
	}


	@Override
	public String getStringValue() 
	{
		String formattedDate;
		String monthName = "";
		String dayString = "";
		
		
		if (day > 0 && day < END_DIGIT) 
		{
			dayString = Integer.toString(day);
			dayString = LEADING_ZERO + day;
		}
		
		else
		{
			dayString = Integer.toString(day);
		}
		
		//Map entry for getting string of month name
		Set<Map.Entry<Integer, String>> monthSet = monthNames.entrySet();
		
		for (Entry<Integer, String> month : monthSet)
		{
			if (month.getKey().equals(getMonth()))
			{
				monthName = month.getValue();
			}
		}
		
		formattedDate = dayString + " " + monthName + " " + Integer.toString(getYear());
		return formattedDate;
	}
}
