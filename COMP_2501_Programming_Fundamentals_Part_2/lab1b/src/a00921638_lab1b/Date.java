package a00921638_lab1b;
/**
 * @author Vladislav Gudkov (A009
 */

public class Date {
	
	//instance variables
	private int year;
	private int month;
	private int day;
	
	//constructor
	public Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//getter for year
	public int getYear() 
	{
		return year;
	}
	
	//setter for year
	public void setYear(int year)
	{
		this.year = year;
	}
	
	//getter for month
	public int getMonth() 
	{
		return month;
	}
	
	//setter for month
	public void setMonth(int month) 
	{
		this.month = month;
	}
	
	//getter for day
	public int getDay() 
	{
		return day;
	}
	
	//setter for day
	public void setDay(int day) 
	{
		this.day = day;
	}

	//getYyMmDd method
	public void getYyMmDd()
	{
		System.out.println("" + year + "-" + month + "-" + day +".");
	}
}
